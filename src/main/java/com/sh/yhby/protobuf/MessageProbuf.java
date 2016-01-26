// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.sh.yhby.protobuf;

public final class MessageProbuf {
  private MessageProbuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 messageId = 1 [default = 0];</code>
     */
    boolean hasMessageId();
    /**
     * <code>optional int32 messageId = 1 [default = 0];</code>
     */
    int getMessageId();

    /**
     * <code>optional string uuid = 2 [default = ""];</code>
     */
    boolean hasUuid();
    /**
     * <code>optional string uuid = 2 [default = ""];</code>
     */
    java.lang.String getUuid();
    /**
     * <code>optional string uuid = 2 [default = ""];</code>
     */
    com.google.protobuf.ByteString
        getUuidBytes();

    /**
     * <code>optional .protobuf.MsgType msgType = 3;</code>
     */
    boolean hasMsgType();
    /**
     * <code>optional .protobuf.MsgType msgType = 3;</code>
     */
    com.sh.yhby.protobuf.MsgTypeProbuf.MsgType getMsgType();

    /**
     * <code>optional int32 from = 4 [default = 0];</code>
     */
    boolean hasFrom();
    /**
     * <code>optional int32 from = 4 [default = 0];</code>
     */
    int getFrom();

    /**
     * <code>optional int32 to = 5 [default = 0];</code>
     */
    boolean hasTo();
    /**
     * <code>optional int32 to = 5 [default = 0];</code>
     */
    int getTo();

    /**
     * <code>optional string content = 6 [default = ""];</code>
     */
    boolean hasContent();
    /**
     * <code>optional string content = 6 [default = ""];</code>
     */
    java.lang.String getContent();
    /**
     * <code>optional string content = 6 [default = ""];</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>optional string sendTime = 7 [default = ""];</code>
     */
    boolean hasSendTime();
    /**
     * <code>optional string sendTime = 7 [default = ""];</code>
     */
    java.lang.String getSendTime();
    /**
     * <code>optional string sendTime = 7 [default = ""];</code>
     */
    com.google.protobuf.ByteString
        getSendTimeBytes();
  }
  /**
   * Protobuf type {@code protobuf.Message}
   */
  public static final class Message extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protobuf.Message)
      MessageOrBuilder {
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Message(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Message defaultInstance;
    public static Message getDefaultInstance() {
      return defaultInstance;
    }

    public Message getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              messageId_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              uuid_ = bs;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.sh.yhby.protobuf.MsgTypeProbuf.MsgType value = com.sh.yhby.protobuf.MsgTypeProbuf.MsgType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                msgType_ = value;
              }
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              from_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              to_ = input.readInt32();
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              content_ = bs;
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              sendTime_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sh.yhby.protobuf.MessageProbuf.internal_static_protobuf_Message_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sh.yhby.protobuf.MessageProbuf.internal_static_protobuf_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sh.yhby.protobuf.MessageProbuf.Message.class, com.sh.yhby.protobuf.MessageProbuf.Message.Builder.class);
    }

    public static com.google.protobuf.Parser<Message> PARSER =
        new com.google.protobuf.AbstractParser<Message>() {
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MESSAGEID_FIELD_NUMBER = 1;
    private int messageId_;
    /**
     * <code>optional int32 messageId = 1 [default = 0];</code>
     */
    public boolean hasMessageId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 messageId = 1 [default = 0];</code>
     */
    public int getMessageId() {
      return messageId_;
    }

    public static final int UUID_FIELD_NUMBER = 2;
    private java.lang.Object uuid_;
    /**
     * <code>optional string uuid = 2 [default = ""];</code>
     */
    public boolean hasUuid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string uuid = 2 [default = ""];</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uuid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string uuid = 2 [default = ""];</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSGTYPE_FIELD_NUMBER = 3;
    private com.sh.yhby.protobuf.MsgTypeProbuf.MsgType msgType_;
    /**
     * <code>optional .protobuf.MsgType msgType = 3;</code>
     */
    public boolean hasMsgType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .protobuf.MsgType msgType = 3;</code>
     */
    public com.sh.yhby.protobuf.MsgTypeProbuf.MsgType getMsgType() {
      return msgType_;
    }

    public static final int FROM_FIELD_NUMBER = 4;
    private int from_;
    /**
     * <code>optional int32 from = 4 [default = 0];</code>
     */
    public boolean hasFrom() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 from = 4 [default = 0];</code>
     */
    public int getFrom() {
      return from_;
    }

    public static final int TO_FIELD_NUMBER = 5;
    private int to_;
    /**
     * <code>optional int32 to = 5 [default = 0];</code>
     */
    public boolean hasTo() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 to = 5 [default = 0];</code>
     */
    public int getTo() {
      return to_;
    }

    public static final int CONTENT_FIELD_NUMBER = 6;
    private java.lang.Object content_;
    /**
     * <code>optional string content = 6 [default = ""];</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string content = 6 [default = ""];</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          content_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string content = 6 [default = ""];</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDTIME_FIELD_NUMBER = 7;
    private java.lang.Object sendTime_;
    /**
     * <code>optional string sendTime = 7 [default = ""];</code>
     */
    public boolean hasSendTime() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string sendTime = 7 [default = ""];</code>
     */
    public java.lang.String getSendTime() {
      java.lang.Object ref = sendTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sendTime_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sendTime = 7 [default = ""];</code>
     */
    public com.google.protobuf.ByteString
        getSendTimeBytes() {
      java.lang.Object ref = sendTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sendTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      messageId_ = 0;
      uuid_ = "";
      msgType_ = com.sh.yhby.protobuf.MsgTypeProbuf.MsgType.TEXT_MESSAGE;
      from_ = 0;
      to_ = 0;
      content_ = "";
      sendTime_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, messageId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getUuidBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, msgType_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, from_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, to_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getContentBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getSendTimeBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, messageId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getUuidBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, msgType_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, from_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, to_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getContentBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getSendTimeBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.sh.yhby.protobuf.MessageProbuf.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.sh.yhby.protobuf.MessageProbuf.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.sh.yhby.protobuf.MessageProbuf.Message prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protobuf.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.Message)
        com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sh.yhby.protobuf.MessageProbuf.internal_static_protobuf_Message_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sh.yhby.protobuf.MessageProbuf.internal_static_protobuf_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sh.yhby.protobuf.MessageProbuf.Message.class, com.sh.yhby.protobuf.MessageProbuf.Message.Builder.class);
      }

      // Construct using com.sh.yhby.protobuf.MessageProbuf.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        messageId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        uuid_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        msgType_ = com.sh.yhby.protobuf.MsgTypeProbuf.MsgType.TEXT_MESSAGE;
        bitField0_ = (bitField0_ & ~0x00000004);
        from_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        to_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        content_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        sendTime_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sh.yhby.protobuf.MessageProbuf.internal_static_protobuf_Message_descriptor;
      }

      public com.sh.yhby.protobuf.MessageProbuf.Message getDefaultInstanceForType() {
        return com.sh.yhby.protobuf.MessageProbuf.Message.getDefaultInstance();
      }

      public com.sh.yhby.protobuf.MessageProbuf.Message build() {
        com.sh.yhby.protobuf.MessageProbuf.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.sh.yhby.protobuf.MessageProbuf.Message buildPartial() {
        com.sh.yhby.protobuf.MessageProbuf.Message result = new com.sh.yhby.protobuf.MessageProbuf.Message(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.messageId_ = messageId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.uuid_ = uuid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.msgType_ = msgType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.from_ = from_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.to_ = to_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.content_ = content_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.sendTime_ = sendTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.sh.yhby.protobuf.MessageProbuf.Message) {
          return mergeFrom((com.sh.yhby.protobuf.MessageProbuf.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sh.yhby.protobuf.MessageProbuf.Message other) {
        if (other == com.sh.yhby.protobuf.MessageProbuf.Message.getDefaultInstance()) return this;
        if (other.hasMessageId()) {
          setMessageId(other.getMessageId());
        }
        if (other.hasUuid()) {
          bitField0_ |= 0x00000002;
          uuid_ = other.uuid_;
          onChanged();
        }
        if (other.hasMsgType()) {
          setMsgType(other.getMsgType());
        }
        if (other.hasFrom()) {
          setFrom(other.getFrom());
        }
        if (other.hasTo()) {
          setTo(other.getTo());
        }
        if (other.hasContent()) {
          bitField0_ |= 0x00000020;
          content_ = other.content_;
          onChanged();
        }
        if (other.hasSendTime()) {
          bitField0_ |= 0x00000040;
          sendTime_ = other.sendTime_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.sh.yhby.protobuf.MessageProbuf.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.sh.yhby.protobuf.MessageProbuf.Message) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int messageId_ ;
      /**
       * <code>optional int32 messageId = 1 [default = 0];</code>
       */
      public boolean hasMessageId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 messageId = 1 [default = 0];</code>
       */
      public int getMessageId() {
        return messageId_;
      }
      /**
       * <code>optional int32 messageId = 1 [default = 0];</code>
       */
      public Builder setMessageId(int value) {
        bitField0_ |= 0x00000001;
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 messageId = 1 [default = 0];</code>
       */
      public Builder clearMessageId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        messageId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object uuid_ = "";
      /**
       * <code>optional string uuid = 2 [default = ""];</code>
       */
      public boolean hasUuid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string uuid = 2 [default = ""];</code>
       */
      public java.lang.String getUuid() {
        java.lang.Object ref = uuid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uuid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string uuid = 2 [default = ""];</code>
       */
      public com.google.protobuf.ByteString
          getUuidBytes() {
        java.lang.Object ref = uuid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          uuid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uuid = 2 [default = ""];</code>
       */
      public Builder setUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        uuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uuid = 2 [default = ""];</code>
       */
      public Builder clearUuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        uuid_ = getDefaultInstance().getUuid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string uuid = 2 [default = ""];</code>
       */
      public Builder setUuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        uuid_ = value;
        onChanged();
        return this;
      }

      private com.sh.yhby.protobuf.MsgTypeProbuf.MsgType msgType_ = com.sh.yhby.protobuf.MsgTypeProbuf.MsgType.TEXT_MESSAGE;
      /**
       * <code>optional .protobuf.MsgType msgType = 3;</code>
       */
      public boolean hasMsgType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .protobuf.MsgType msgType = 3;</code>
       */
      public com.sh.yhby.protobuf.MsgTypeProbuf.MsgType getMsgType() {
        return msgType_;
      }
      /**
       * <code>optional .protobuf.MsgType msgType = 3;</code>
       */
      public Builder setMsgType(com.sh.yhby.protobuf.MsgTypeProbuf.MsgType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        msgType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protobuf.MsgType msgType = 3;</code>
       */
      public Builder clearMsgType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        msgType_ = com.sh.yhby.protobuf.MsgTypeProbuf.MsgType.TEXT_MESSAGE;
        onChanged();
        return this;
      }

      private int from_ ;
      /**
       * <code>optional int32 from = 4 [default = 0];</code>
       */
      public boolean hasFrom() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 from = 4 [default = 0];</code>
       */
      public int getFrom() {
        return from_;
      }
      /**
       * <code>optional int32 from = 4 [default = 0];</code>
       */
      public Builder setFrom(int value) {
        bitField0_ |= 0x00000008;
        from_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 from = 4 [default = 0];</code>
       */
      public Builder clearFrom() {
        bitField0_ = (bitField0_ & ~0x00000008);
        from_ = 0;
        onChanged();
        return this;
      }

      private int to_ ;
      /**
       * <code>optional int32 to = 5 [default = 0];</code>
       */
      public boolean hasTo() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 to = 5 [default = 0];</code>
       */
      public int getTo() {
        return to_;
      }
      /**
       * <code>optional int32 to = 5 [default = 0];</code>
       */
      public Builder setTo(int value) {
        bitField0_ |= 0x00000010;
        to_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 to = 5 [default = 0];</code>
       */
      public Builder clearTo() {
        bitField0_ = (bitField0_ & ~0x00000010);
        to_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>optional string content = 6 [default = ""];</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string content = 6 [default = ""];</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            content_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string content = 6 [default = ""];</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string content = 6 [default = ""];</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string content = 6 [default = ""];</code>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000020);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>optional string content = 6 [default = ""];</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        content_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object sendTime_ = "";
      /**
       * <code>optional string sendTime = 7 [default = ""];</code>
       */
      public boolean hasSendTime() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string sendTime = 7 [default = ""];</code>
       */
      public java.lang.String getSendTime() {
        java.lang.Object ref = sendTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sendTime_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sendTime = 7 [default = ""];</code>
       */
      public com.google.protobuf.ByteString
          getSendTimeBytes() {
        java.lang.Object ref = sendTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sendTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sendTime = 7 [default = ""];</code>
       */
      public Builder setSendTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        sendTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sendTime = 7 [default = ""];</code>
       */
      public Builder clearSendTime() {
        bitField0_ = (bitField0_ & ~0x00000040);
        sendTime_ = getDefaultInstance().getSendTime();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sendTime = 7 [default = ""];</code>
       */
      public Builder setSendTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        sendTime_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protobuf.Message)
    }

    static {
      defaultInstance = new Message(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protobuf.Message)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_Message_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\010protobuf\032\rmsgtype.proto" +
      "\"\232\001\n\007Message\022\024\n\tmessageId\030\001 \001(\005:\0010\022\016\n\004uu" +
      "id\030\002 \001(\t:\000\022\"\n\007msgType\030\003 \001(\0162\021.protobuf.M" +
      "sgType\022\017\n\004from\030\004 \001(\005:\0010\022\r\n\002to\030\005 \001(\005:\0010\022\021" +
      "\n\007content\030\006 \001(\t:\000\022\022\n\010sendTime\030\007 \001(\t:\000B%\n" +
      "\024com.sh.yhby.protobufB\rMessageProbuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sh.yhby.protobuf.MsgTypeProbuf.getDescriptor(),
        }, assigner);
    internal_static_protobuf_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protobuf_Message_descriptor,
        new java.lang.String[] { "MessageId", "Uuid", "MsgType", "From", "To", "Content", "SendTime", });
    com.sh.yhby.protobuf.MsgTypeProbuf.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}