// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface CryptoKeyVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.CryptoKeyVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name for this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;cryptoKeyVersions/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name for this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;cryptoKeyVersions/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The current state of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState state = 3;</code>
   */
  int getStateValue();
  /**
   * <pre>
   * The current state of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState state = 3;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState getState();

  /**
   * <pre>
   * Output only. The time at which this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time at which this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time at which this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material is scheduled
   * for destruction. Only present if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 5;</code>
   */
  boolean hasDestroyTime();
  /**
   * <pre>
   * Output only. The time this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material is scheduled
   * for destruction. Only present if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 5;</code>
   */
  com.google.protobuf.Timestamp getDestroyTime();
  /**
   * <pre>
   * Output only. The time this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material is scheduled
   * for destruction. Only present if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDestroyTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time this CryptoKeyVersion's key material was
   * destroyed. Only present if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_event_time = 6;</code>
   */
  boolean hasDestroyEventTime();
  /**
   * <pre>
   * Output only. The time this CryptoKeyVersion's key material was
   * destroyed. Only present if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_event_time = 6;</code>
   */
  com.google.protobuf.Timestamp getDestroyEventTime();
  /**
   * <pre>
   * Output only. The time this CryptoKeyVersion's key material was
   * destroyed. Only present if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_event_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDestroyEventTimeOrBuilder();
}