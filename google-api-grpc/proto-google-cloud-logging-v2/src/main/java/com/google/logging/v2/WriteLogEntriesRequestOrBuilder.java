// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public interface WriteLogEntriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.WriteLogEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. A default log resource name that is assigned to all log entries
   * in `entries` that do not specify a value for `log_name`:
   *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
   *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
   *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
   * `[LOG_ID]` must be URL-encoded. For example,
   * `"projects/my-project-id/logs/syslog"` or
   * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * For more information about log names, see
   * [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>string log_name = 1;</code>
   */
  java.lang.String getLogName();
  /**
   * <pre>
   * Optional. A default log resource name that is assigned to all log entries
   * in `entries` that do not specify a value for `log_name`:
   *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
   *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
   *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
   * `[LOG_ID]` must be URL-encoded. For example,
   * `"projects/my-project-id/logs/syslog"` or
   * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * For more information about log names, see
   * [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>string log_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getLogNameBytes();

  /**
   * <pre>
   * Optional. A default monitored resource object that is assigned to all log
   * entries in `entries` that do not specify a value for `resource`. Example:
   *     { "type": "gce_instance",
   *       "labels": {
   *         "zone": "us-central1-a", "instance_id": "00000000000000000000" }}
   * See [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 2;</code>
   */
  boolean hasResource();
  /**
   * <pre>
   * Optional. A default monitored resource object that is assigned to all log
   * entries in `entries` that do not specify a value for `resource`. Example:
   *     { "type": "gce_instance",
   *       "labels": {
   *         "zone": "us-central1-a", "instance_id": "00000000000000000000" }}
   * See [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 2;</code>
   */
  com.google.api.MonitoredResource getResource();
  /**
   * <pre>
   * Optional. A default monitored resource object that is assigned to all log
   * entries in `entries` that do not specify a value for `resource`. Example:
   *     { "type": "gce_instance",
   *       "labels": {
   *         "zone": "us-central1-a", "instance_id": "00000000000000000000" }}
   * See [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 2;</code>
   */
  com.google.api.MonitoredResourceOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * Optional. Default labels that are added to the `labels` field of all log
   * entries in `entries`. If a log entry already has a label with the same key
   * as a label in this parameter, then the log entry's label is not changed.
   * See [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. Default labels that are added to the `labels` field of all log
   * entries in `entries`. If a log entry already has a label with the same key
   * as a label in this parameter, then the log entry's label is not changed.
   * See [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. Default labels that are added to the `labels` field of all log
   * entries in `entries`. If a log entry already has a label with the same key
   * as a label in this parameter, then the log entry's label is not changed.
   * See [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. Default labels that are added to the `labels` field of all log
   * entries in `entries`. If a log entry already has a label with the same key
   * as a label in this parameter, then the log entry's label is not changed.
   * See [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Default labels that are added to the `labels` field of all log
   * entries in `entries`. If a log entry already has a label with the same key
   * as a label in this parameter, then the log entry's label is not changed.
   * See [LogEntry][google.logging.v2.LogEntry].
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Required. The log entries to send to Stackdriver Logging. The order of log
   * entries in this list does not matter. Values supplied in this method's
   * `log_name`, `resource`, and `labels` fields are copied into those log
   * entries in this list that do not include values for their corresponding
   * fields. For more information, see the
   * [LogEntry][google.logging.v2.LogEntry] type.
   * If the `timestamp` or `insert_id` fields are missing in log entries, then
   * this method supplies the current time or a unique identifier, respectively.
   * The supplied values are chosen so that, among the log entries that did not
   * supply their own values, the entries earlier in the list will sort before
   * the entries later in the list. See the `entries.list` method.
   * Log entries with timestamps that are more than the
   * [logs retention period](/logging/quota-policy) in the past or more than
   * 24 hours in the future will not be available when calling `entries.list`.
   * However, those log entries can still be exported with
   * [LogSinks](/logging/docs/api/tasks/exporting-logs).
   * To improve throughput and to avoid exceeding the
   * [quota limit](/logging/quota-policy) for calls to `entries.write`,
   * you should try to include several log entries in this list,
   * rather than calling this method for each individual log entry.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogEntry entries = 4;</code>
   */
  java.util.List<com.google.logging.v2.LogEntry> 
      getEntriesList();
  /**
   * <pre>
   * Required. The log entries to send to Stackdriver Logging. The order of log
   * entries in this list does not matter. Values supplied in this method's
   * `log_name`, `resource`, and `labels` fields are copied into those log
   * entries in this list that do not include values for their corresponding
   * fields. For more information, see the
   * [LogEntry][google.logging.v2.LogEntry] type.
   * If the `timestamp` or `insert_id` fields are missing in log entries, then
   * this method supplies the current time or a unique identifier, respectively.
   * The supplied values are chosen so that, among the log entries that did not
   * supply their own values, the entries earlier in the list will sort before
   * the entries later in the list. See the `entries.list` method.
   * Log entries with timestamps that are more than the
   * [logs retention period](/logging/quota-policy) in the past or more than
   * 24 hours in the future will not be available when calling `entries.list`.
   * However, those log entries can still be exported with
   * [LogSinks](/logging/docs/api/tasks/exporting-logs).
   * To improve throughput and to avoid exceeding the
   * [quota limit](/logging/quota-policy) for calls to `entries.write`,
   * you should try to include several log entries in this list,
   * rather than calling this method for each individual log entry.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogEntry entries = 4;</code>
   */
  com.google.logging.v2.LogEntry getEntries(int index);
  /**
   * <pre>
   * Required. The log entries to send to Stackdriver Logging. The order of log
   * entries in this list does not matter. Values supplied in this method's
   * `log_name`, `resource`, and `labels` fields are copied into those log
   * entries in this list that do not include values for their corresponding
   * fields. For more information, see the
   * [LogEntry][google.logging.v2.LogEntry] type.
   * If the `timestamp` or `insert_id` fields are missing in log entries, then
   * this method supplies the current time or a unique identifier, respectively.
   * The supplied values are chosen so that, among the log entries that did not
   * supply their own values, the entries earlier in the list will sort before
   * the entries later in the list. See the `entries.list` method.
   * Log entries with timestamps that are more than the
   * [logs retention period](/logging/quota-policy) in the past or more than
   * 24 hours in the future will not be available when calling `entries.list`.
   * However, those log entries can still be exported with
   * [LogSinks](/logging/docs/api/tasks/exporting-logs).
   * To improve throughput and to avoid exceeding the
   * [quota limit](/logging/quota-policy) for calls to `entries.write`,
   * you should try to include several log entries in this list,
   * rather than calling this method for each individual log entry.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogEntry entries = 4;</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   * Required. The log entries to send to Stackdriver Logging. The order of log
   * entries in this list does not matter. Values supplied in this method's
   * `log_name`, `resource`, and `labels` fields are copied into those log
   * entries in this list that do not include values for their corresponding
   * fields. For more information, see the
   * [LogEntry][google.logging.v2.LogEntry] type.
   * If the `timestamp` or `insert_id` fields are missing in log entries, then
   * this method supplies the current time or a unique identifier, respectively.
   * The supplied values are chosen so that, among the log entries that did not
   * supply their own values, the entries earlier in the list will sort before
   * the entries later in the list. See the `entries.list` method.
   * Log entries with timestamps that are more than the
   * [logs retention period](/logging/quota-policy) in the past or more than
   * 24 hours in the future will not be available when calling `entries.list`.
   * However, those log entries can still be exported with
   * [LogSinks](/logging/docs/api/tasks/exporting-logs).
   * To improve throughput and to avoid exceeding the
   * [quota limit](/logging/quota-policy) for calls to `entries.write`,
   * you should try to include several log entries in this list,
   * rather than calling this method for each individual log entry.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogEntry entries = 4;</code>
   */
  java.util.List<? extends com.google.logging.v2.LogEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <pre>
   * Required. The log entries to send to Stackdriver Logging. The order of log
   * entries in this list does not matter. Values supplied in this method's
   * `log_name`, `resource`, and `labels` fields are copied into those log
   * entries in this list that do not include values for their corresponding
   * fields. For more information, see the
   * [LogEntry][google.logging.v2.LogEntry] type.
   * If the `timestamp` or `insert_id` fields are missing in log entries, then
   * this method supplies the current time or a unique identifier, respectively.
   * The supplied values are chosen so that, among the log entries that did not
   * supply their own values, the entries earlier in the list will sort before
   * the entries later in the list. See the `entries.list` method.
   * Log entries with timestamps that are more than the
   * [logs retention period](/logging/quota-policy) in the past or more than
   * 24 hours in the future will not be available when calling `entries.list`.
   * However, those log entries can still be exported with
   * [LogSinks](/logging/docs/api/tasks/exporting-logs).
   * To improve throughput and to avoid exceeding the
   * [quota limit](/logging/quota-policy) for calls to `entries.write`,
   * you should try to include several log entries in this list,
   * rather than calling this method for each individual log entry.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogEntry entries = 4;</code>
   */
  com.google.logging.v2.LogEntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Whether valid entries should be written even if some other
   * entries fail due to INVALID_ARGUMENT or PERMISSION_DENIED errors. If any
   * entry is not written, then the response status is the error associated
   * with one of the failed entries and the response includes error details
   * keyed by the entries' zero-based index in the `entries.write` method.
   * </pre>
   *
   * <code>bool partial_success = 5;</code>
   */
  boolean getPartialSuccess();

  /**
   * <pre>
   * Optional. If true, the request should expect normal response, but the
   * entries won't be persisted nor exported. Useful for checking whether the
   * logging API endpoints are working properly before sending valuable data.
   * </pre>
   *
   * <code>bool dry_run = 6;</code>
   */
  boolean getDryRun();
}
