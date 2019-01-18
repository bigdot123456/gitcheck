// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: taglib.proto

package org.jigsaw.payment.model;

/**
 * <pre>
 **
 * 存储配置支持，标识对应的表
 * </pre>
 *
 * Protobuf type {@code TableMessageOption}
 */
public  final class TableMessageOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TableMessageOption)
    TableMessageOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableMessageOption.newBuilder() to construct.
  private TableMessageOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableMessageOption() {
    tableName_ = "";
    idNo_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TableMessageOption(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            tableName_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            idNo_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.jigsaw.payment.model.Taglib.internal_static_TableMessageOption_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jigsaw.payment.model.Taglib.internal_static_TableMessageOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jigsaw.payment.model.TableMessageOption.class, org.jigsaw.payment.model.TableMessageOption.Builder.class);
  }

  private int bitField0_;
  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   * <pre>
   *标识数据库中的表名
   * </pre>
   *
   * <code>required string table_name = 1;</code>
   */
  public boolean hasTableName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   *标识数据库中的表名
   * </pre>
   *
   * <code>required string table_name = 1;</code>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        tableName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   *标识数据库中的表名
   * </pre>
   *
   * <code>required string table_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_NO_FIELD_NUMBER = 2;
  private int idNo_;
  /**
   * <pre>
   *标识id的后缀，三位后缀，从001开始。
   * </pre>
   *
   * <code>optional int32 id_no = 2;</code>
   */
  public boolean hasIdNo() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   *标识id的后缀，三位后缀，从001开始。
   * </pre>
   *
   * <code>optional int32 id_no = 2;</code>
   */
  public int getIdNo() {
    return idNo_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasTableName()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, idNo_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, idNo_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.jigsaw.payment.model.TableMessageOption)) {
      return super.equals(obj);
    }
    org.jigsaw.payment.model.TableMessageOption other = (org.jigsaw.payment.model.TableMessageOption) obj;

    boolean result = true;
    result = result && (hasTableName() == other.hasTableName());
    if (hasTableName()) {
      result = result && getTableName()
          .equals(other.getTableName());
    }
    result = result && (hasIdNo() == other.hasIdNo());
    if (hasIdNo()) {
      result = result && (getIdNo()
          == other.getIdNo());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTableName()) {
      hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTableName().hashCode();
    }
    if (hasIdNo()) {
      hash = (37 * hash) + ID_NO_FIELD_NUMBER;
      hash = (53 * hash) + getIdNo();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jigsaw.payment.model.TableMessageOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jigsaw.payment.model.TableMessageOption parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.jigsaw.payment.model.TableMessageOption prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * 存储配置支持，标识对应的表
   * </pre>
   *
   * Protobuf type {@code TableMessageOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TableMessageOption)
      org.jigsaw.payment.model.TableMessageOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jigsaw.payment.model.Taglib.internal_static_TableMessageOption_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jigsaw.payment.model.Taglib.internal_static_TableMessageOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jigsaw.payment.model.TableMessageOption.class, org.jigsaw.payment.model.TableMessageOption.Builder.class);
    }

    // Construct using org.jigsaw.payment.model.TableMessageOption.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      tableName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      idNo_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jigsaw.payment.model.Taglib.internal_static_TableMessageOption_descriptor;
    }

    public org.jigsaw.payment.model.TableMessageOption getDefaultInstanceForType() {
      return org.jigsaw.payment.model.TableMessageOption.getDefaultInstance();
    }

    public org.jigsaw.payment.model.TableMessageOption build() {
      org.jigsaw.payment.model.TableMessageOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jigsaw.payment.model.TableMessageOption buildPartial() {
      org.jigsaw.payment.model.TableMessageOption result = new org.jigsaw.payment.model.TableMessageOption(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.tableName_ = tableName_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.idNo_ = idNo_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.jigsaw.payment.model.TableMessageOption) {
        return mergeFrom((org.jigsaw.payment.model.TableMessageOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jigsaw.payment.model.TableMessageOption other) {
      if (other == org.jigsaw.payment.model.TableMessageOption.getDefaultInstance()) return this;
      if (other.hasTableName()) {
        bitField0_ |= 0x00000001;
        tableName_ = other.tableName_;
        onChanged();
      }
      if (other.hasIdNo()) {
        setIdNo(other.getIdNo());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!hasTableName()) {
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jigsaw.payment.model.TableMessageOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jigsaw.payment.model.TableMessageOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object tableName_ = "";
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public boolean hasTableName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tableName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public Builder clearTableName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      tableName_ = value;
      onChanged();
      return this;
    }

    private int idNo_ ;
    /**
     * <pre>
     *标识id的后缀，三位后缀，从001开始。
     * </pre>
     *
     * <code>optional int32 id_no = 2;</code>
     */
    public boolean hasIdNo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *标识id的后缀，三位后缀，从001开始。
     * </pre>
     *
     * <code>optional int32 id_no = 2;</code>
     */
    public int getIdNo() {
      return idNo_;
    }
    /**
     * <pre>
     *标识id的后缀，三位后缀，从001开始。
     * </pre>
     *
     * <code>optional int32 id_no = 2;</code>
     */
    public Builder setIdNo(int value) {
      bitField0_ |= 0x00000002;
      idNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *标识id的后缀，三位后缀，从001开始。
     * </pre>
     *
     * <code>optional int32 id_no = 2;</code>
     */
    public Builder clearIdNo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      idNo_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TableMessageOption)
  }

  // @@protoc_insertion_point(class_scope:TableMessageOption)
  private static final org.jigsaw.payment.model.TableMessageOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jigsaw.payment.model.TableMessageOption();
  }

  public static org.jigsaw.payment.model.TableMessageOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TableMessageOption>
      PARSER = new com.google.protobuf.AbstractParser<TableMessageOption>() {
    public TableMessageOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TableMessageOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TableMessageOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableMessageOption> getParserForType() {
    return PARSER;
  }

  public org.jigsaw.payment.model.TableMessageOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

