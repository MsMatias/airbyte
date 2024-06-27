/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */
package io.airbyte.integrations.destination.snowflake.typing_deduping

import org.junit.jupiter.api.Test

class SnowflakeInternalStagingTypingDedupingTest : AbstractSnowflakeTypingDedupingTest() {
    override val configPath: String
        get() = "secrets/1s1t_internal_staging_config.json"

    @Test
    override fun truncateRefresh() {
        super.truncateRefresh()
    }
}
