package io.airbyte.integrations.destination.mqtt;

import static org.mockito.Mockito.inOrder;

import io.airbyte.commons.json.Jsons;
import io.airbyte.integrations.base.FailureTrackingAirbyteMessageConsumer;
import io.airbyte.protocol.models.AirbyteMessage;
import io.airbyte.protocol.models.AirbyteMessage.Type;
import io.airbyte.protocol.models.AirbyteStateMessage;
import io.airbyte.protocol.models.AirbyteStateMessage.AirbyteStateType;
import io.airbyte.protocol.models.AirbyteStreamState;
import io.airbyte.protocol.models.StreamDescriptor;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public abstract class PerStreamStateMessageTest {
  abstract Consumer<AirbyteMessage> getMockedConsumer();

  abstract FailureTrackingAirbyteMessageConsumer getMessageConsumer();

  @Test
  void runATest() throws Exception {
    final AirbyteMessage airbyteMessage1 = AirbyteMessageCreator.createStreamStateMessage("name_one", "state_one");
    final AirbyteMessage airbyteMessage2 = AirbyteMessageCreator.createStreamStateMessage("name_one", "state_one");
    final AirbyteMessage airbyteMessage3 = AirbyteMessageCreator.createStreamStateMessage("name_one", "state_one");
    final FailureTrackingAirbyteMessageConsumer messageConsumer = getMessageConsumer();

    messageConsumer.accept(airbyteMessage1);
    messageConsumer.accept(airbyteMessage2);
    messageConsumer.accept(airbyteMessage3);


    final Consumer<AirbyteMessage> mConsumer = getMockedConsumer();
    final InOrder inOrder = inOrder(mConsumer);

    inOrder.verify(mConsumer).accept(airbyteMessage1);
    inOrder.verify(mConsumer).accept(airbyteMessage2);
    inOrder.verify(mConsumer).accept(airbyteMessage3);
  }

  class AirbyteMessageCreator {
    public static AirbyteMessage createStreamStateMessage(final String name, final String value) {
      return new AirbyteMessage()
          .withType(Type.STATE)
          .withState(
              new AirbyteStateMessage()
                  .withType(AirbyteStateType.STREAM)
                  .withStream(
                      new AirbyteStreamState()
                          .withStreamDescriptor(
                              new StreamDescriptor()
                                  .withName(name)
                          )
                          .withStreamState(Jsons.jsonNode(value))
                  )
          );
    }

  }

}
