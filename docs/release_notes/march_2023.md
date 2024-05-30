# March 2023

## [airbyte v0.42.0](https://github.com/airbytehq/airbyte/releases/tag/v0.42.0) to [v0.42.1](https://github.com/airbytehq/airbyte/releases/tag/v0.42.1)

This page includes new features and improvements to the Airbyte Cloud and Airbyte Open Source platforms.

## **✨ New and improved features**

- **New Sources and Promotions**

  - 🎉 New Source: [Unleash](/integrations/sources/unleash) [low-code CDK] ([#19923](https://github.com/airbytehq/airbyte/pull/19923))
  - 🎉 Source [Twitter](/integrations/sources/twitter): to Alpha and in Cloud ([#23832](https://github.com/airbytehq/airbyte/pull/23832))
  - 🎉 Source [Confluence](/integrations/sources/confluence): Enabled in cloud and now in Beta ([#23775](https://github.com/airbytehq/airbyte/pull/23775))
  - 🎉 Source [Airtable](/integrations/sources/airtable): to GA ([#23763](https://github.com/airbytehq/airbyte/pull/23763))
  - 🎉 Source [Paystack](/integrations/sources/paystack): in Cloud
  - 🎉 Source [Google Analytics 4](/integrations/sources/google-analytics-data-api): to GA
  - 🎉 Source [Strava](/integrations/sources/strava): to Beta
  - 🎉 Source [GCS](/integrations/sources/gcs): in Cloud
  - 🎉 Source [ZohoCRM](/integrations/sources/zoho-crm): to Alpha and in Cloud
  - 🎉 Source [Yandex Metrica](/integrations/sources/yandex-metrica): to Beta and in Cloud
  - 🎉 Source [Salesloft](/integrations/sources/salesloft/): to Alpha and in Cloud
  - 🎉 Source [Xero](/integrations/sources/xero/): to Beta and in Cloud
  - 🎉 Source [Trello](/integrations/sources/trello/): to Beta
  - 🎉 Source [Paystack](/integrations/sources/paystack/): to Beta and in Cloud
  - 🎉 Source Trustpilot: in Cloud
  - 🎉 Source [LinkedIn Pages](/integrations/sources/linkedin-pages): in Cloud
  - 🎉 Source [Pipedrive](/integrations/sources/pipedrive): to Beta and in Cloud ([#23539](https://github.com/airbytehq/airbyte/pull/23539))
  - 🎉 Source [Chargebee](/integrations/sources/chargebee): Migrate to YAML ([#21688](https://github.com/airbytehq/airbyte/pull/21688))

- **New Features for Existing Connectors**

  - Redshift Destination: Add SSH Tunnelling Config Option ([#23523](https://github.com/airbytehq/airbyte/pull/23523))
  - 🎉 Source Amazon Seller Partner - Implement reportOptions for all missing reports ([#23606](https://github.com/airbytehq/airbyte/pull/23606))
  - Source Tiktok: allow to filter advertiser in reports ([#23377](https://github.com/airbytehq/airbyte/pull/23377))
  - 🎉 Source Github - added user friendly messages, added AirbyteTracedException config_error ([#23467](https://github.com/airbytehq/airbyte/pull/23467))
  - 🎉 Destination Weaviate: Support any string based ID and fix issues with additionalProperties ([#22527](https://github.com/airbytehq/airbyte/pull/22527))

- **New Features in Airbyte Platform**
  - 🎉 octavia-cli: add pypi package workflow ([#22654](https://github.com/airbytehq/airbyte/pull/22654))
  - 🪟🎉 Connector builder projects UI (#4774)
  - 🎉 Add stream syncing or resetting state to rows (#5364)

## **🐛 Bug fixes**

- 🐛 Source Delighted: fix `Date Since`
   date-format bug in UI ([#23909](https://github.com/airbytehq/airbyte/pull/23909))
- 🐛 Source Iterable: add retry for 500 - Generic Error, increase `reduce slice max attempts`
   ([#23821](https://github.com/airbytehq/airbyte/pull/23821))
- 🐛 Source S3: Make `Advanced Reader Options`and `Advanced Options`truly `Optional`([#23669](https://github.com/airbytehq/airbyte/pull/23669))
- Source Jira: Small fix in the board stream ([#21524](https://github.com/airbytehq/airbyte/pull/21524))
- 🐛 Source Sentry: fix `None` state_value + other bad `state_values` ([#23619](https://github.com/airbytehq/airbyte/pull/23619))
- 🐛 Source Pinterest: fix for `HTTP - 400 Bad Request`
   when requesting data >= 90 days. ([#23649](https://github.com/airbytehq/airbyte/pull/23649))
- 🐛 Source Fauna: fix bug during discover step ([#23583](https://github.com/airbytehq/airbyte/pull/23583))
- 🐛 Prevent crash on copying malformed manifest into yaml editor (#5391)
