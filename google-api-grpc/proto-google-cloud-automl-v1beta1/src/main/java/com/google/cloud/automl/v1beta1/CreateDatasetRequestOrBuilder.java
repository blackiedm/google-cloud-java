// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface CreateDatasetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.CreateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the project to create the dataset for.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The resource name of the project to create the dataset for.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The dataset to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Dataset dataset = 2;</code>
   */
  boolean hasDataset();
  /**
   * <pre>
   * The dataset to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Dataset dataset = 2;</code>
   */
  com.google.cloud.automl.v1beta1.Dataset getDataset();
  /**
   * <pre>
   * The dataset to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Dataset dataset = 2;</code>
   */
  com.google.cloud.automl.v1beta1.DatasetOrBuilder getDatasetOrBuilder();
}
