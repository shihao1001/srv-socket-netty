// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: action.proto

package com.sh.yhby.protobuf;

public final class ActionProbuf {
  private ActionProbuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ActionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.Action)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .protobuf.ActionType actionType = 1;</code>
     */
    boolean hasActionType();
    /**
     * <code>optional .protobuf.ActionType actionType = 1;</code>
     */
    com.sh.yhby.protobuf.ActionTypeProbuf.ActionType getActionType();

    /**
     * <code>optional string token = 2 [default = ""];</code>
     */
    boolean hasToken();
    /**
     * <code>optional string token = 2 [default = ""];</code>
     */
    java.lang.String getToken();
    /**
     * <code>optional string token = 2 [default = ""];</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();

    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    java.util.List<com.sh.yhby.protobuf.MessageProbuf.Message> 
        getMessagesList();
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    com.sh.yhby.protobuf.MessageProbuf.Message getMessages(int index);
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    int getMessagesCount();
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    java.util.List<? extends com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder> 
        getMessagesOrBuilderList();
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder getMessagesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code protobuf.Action}
   */
  public static final class Action extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protobuf.Action)
      ActionOrBuilder {
    // Use Action.newBuilder() to construct.
    private Action(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Action(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Action defaultInstance;
    public static Action getDefaultInstance() {
      return defaultInstance;
    }

    public Action getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Action(
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
              int rawValue = input.readEnum();
              com.sh.yhby.protobuf.ActionTypeProbuf.ActionType value = com.sh.yhby.protobuf.ActionTypeProbuf.ActionType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                actionType_ = value;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              token_ = bs;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                messages_ = new java.util.ArrayList<com.sh.yhby.protobuf.MessageProbuf.Message>();
                mutable_bitField0_ |= 0x00000004;
              }
              messages_.add(input.readMessage(com.sh.yhby.protobuf.MessageProbuf.Message.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sh.yhby.protobuf.ActionProbuf.internal_static_protobuf_Action_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sh.yhby.protobuf.ActionProbuf.internal_static_protobuf_Action_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sh.yhby.protobuf.ActionProbuf.Action.class, com.sh.yhby.protobuf.ActionProbuf.Action.Builder.class);
    }

    public static com.google.protobuf.Parser<Action> PARSER =
        new com.google.protobuf.AbstractParser<Action>() {
      public Action parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Action(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Action> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ACTIONTYPE_FIELD_NUMBER = 1;
    private com.sh.yhby.protobuf.ActionTypeProbuf.ActionType actionType_;
    /**
     * <code>optional .protobuf.ActionType actionType = 1;</code>
     */
    public boolean hasActionType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .protobuf.ActionType actionType = 1;</code>
     */
    public com.sh.yhby.protobuf.ActionTypeProbuf.ActionType getActionType() {
      return actionType_;
    }

    public static final int TOKEN_FIELD_NUMBER = 2;
    private java.lang.Object token_;
    /**
     * <code>optional string token = 2 [default = ""];</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string token = 2 [default = ""];</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          token_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string token = 2 [default = ""];</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGES_FIELD_NUMBER = 3;
    private java.util.List<com.sh.yhby.protobuf.MessageProbuf.Message> messages_;
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    public java.util.List<com.sh.yhby.protobuf.MessageProbuf.Message> getMessagesList() {
      return messages_;
    }
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    public java.util.List<? extends com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder> 
        getMessagesOrBuilderList() {
      return messages_;
    }
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    public int getMessagesCount() {
      return messages_.size();
    }
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    public com.sh.yhby.protobuf.MessageProbuf.Message getMessages(int index) {
      return messages_.get(index);
    }
    /**
     * <code>repeated .protobuf.Message messages = 3;</code>
     */
    public com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder getMessagesOrBuilder(
        int index) {
      return messages_.get(index);
    }

    private void initFields() {
      actionType_ = com.sh.yhby.protobuf.ActionTypeProbuf.ActionType.PING;
      token_ = "";
      messages_ = java.util.Collections.emptyList();
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
        output.writeEnum(1, actionType_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTokenBytes());
      }
      for (int i = 0; i < messages_.size(); i++) {
        output.writeMessage(3, messages_.get(i));
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
          .computeEnumSize(1, actionType_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTokenBytes());
      }
      for (int i = 0; i < messages_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, messages_.get(i));
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

    public static com.sh.yhby.protobuf.ActionProbuf.Action parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.sh.yhby.protobuf.ActionProbuf.Action parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.sh.yhby.protobuf.ActionProbuf.Action prototype) {
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
     * Protobuf type {@code protobuf.Action}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.Action)
        com.sh.yhby.protobuf.ActionProbuf.ActionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sh.yhby.protobuf.ActionProbuf.internal_static_protobuf_Action_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sh.yhby.protobuf.ActionProbuf.internal_static_protobuf_Action_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sh.yhby.protobuf.ActionProbuf.Action.class, com.sh.yhby.protobuf.ActionProbuf.Action.Builder.class);
      }

      // Construct using com.sh.yhby.protobuf.ActionProbuf.Action.newBuilder()
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
          getMessagesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        actionType_ = com.sh.yhby.protobuf.ActionTypeProbuf.ActionType.PING;
        bitField0_ = (bitField0_ & ~0x00000001);
        token_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (messagesBuilder_ == null) {
          messages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          messagesBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sh.yhby.protobuf.ActionProbuf.internal_static_protobuf_Action_descriptor;
      }

      public com.sh.yhby.protobuf.ActionProbuf.Action getDefaultInstanceForType() {
        return com.sh.yhby.protobuf.ActionProbuf.Action.getDefaultInstance();
      }

      public com.sh.yhby.protobuf.ActionProbuf.Action build() {
        com.sh.yhby.protobuf.ActionProbuf.Action result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.sh.yhby.protobuf.ActionProbuf.Action buildPartial() {
        com.sh.yhby.protobuf.ActionProbuf.Action result = new com.sh.yhby.protobuf.ActionProbuf.Action(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.actionType_ = actionType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.token_ = token_;
        if (messagesBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            messages_ = java.util.Collections.unmodifiableList(messages_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.messages_ = messages_;
        } else {
          result.messages_ = messagesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.sh.yhby.protobuf.ActionProbuf.Action) {
          return mergeFrom((com.sh.yhby.protobuf.ActionProbuf.Action)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sh.yhby.protobuf.ActionProbuf.Action other) {
        if (other == com.sh.yhby.protobuf.ActionProbuf.Action.getDefaultInstance()) return this;
        if (other.hasActionType()) {
          setActionType(other.getActionType());
        }
        if (other.hasToken()) {
          bitField0_ |= 0x00000002;
          token_ = other.token_;
          onChanged();
        }
        if (messagesBuilder_ == null) {
          if (!other.messages_.isEmpty()) {
            if (messages_.isEmpty()) {
              messages_ = other.messages_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureMessagesIsMutable();
              messages_.addAll(other.messages_);
            }
            onChanged();
          }
        } else {
          if (!other.messages_.isEmpty()) {
            if (messagesBuilder_.isEmpty()) {
              messagesBuilder_.dispose();
              messagesBuilder_ = null;
              messages_ = other.messages_;
              bitField0_ = (bitField0_ & ~0x00000004);
              messagesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMessagesFieldBuilder() : null;
            } else {
              messagesBuilder_.addAllMessages(other.messages_);
            }
          }
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
        com.sh.yhby.protobuf.ActionProbuf.Action parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.sh.yhby.protobuf.ActionProbuf.Action) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.sh.yhby.protobuf.ActionTypeProbuf.ActionType actionType_ = com.sh.yhby.protobuf.ActionTypeProbuf.ActionType.PING;
      /**
       * <code>optional .protobuf.ActionType actionType = 1;</code>
       */
      public boolean hasActionType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .protobuf.ActionType actionType = 1;</code>
       */
      public com.sh.yhby.protobuf.ActionTypeProbuf.ActionType getActionType() {
        return actionType_;
      }
      /**
       * <code>optional .protobuf.ActionType actionType = 1;</code>
       */
      public Builder setActionType(com.sh.yhby.protobuf.ActionTypeProbuf.ActionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        actionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protobuf.ActionType actionType = 1;</code>
       */
      public Builder clearActionType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        actionType_ = com.sh.yhby.protobuf.ActionTypeProbuf.ActionType.PING;
        onChanged();
        return this;
      }

      private java.lang.Object token_ = "";
      /**
       * <code>optional string token = 2 [default = ""];</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string token = 2 [default = ""];</code>
       */
      public java.lang.String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            token_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string token = 2 [default = ""];</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        java.lang.Object ref = token_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          token_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string token = 2 [default = ""];</code>
       */
      public Builder setToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string token = 2 [default = ""];</code>
       */
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000002);
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      /**
       * <code>optional string token = 2 [default = ""];</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        token_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.sh.yhby.protobuf.MessageProbuf.Message> messages_ =
        java.util.Collections.emptyList();
      private void ensureMessagesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          messages_ = new java.util.ArrayList<com.sh.yhby.protobuf.MessageProbuf.Message>(messages_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.sh.yhby.protobuf.MessageProbuf.Message, com.sh.yhby.protobuf.MessageProbuf.Message.Builder, com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder> messagesBuilder_;

      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public java.util.List<com.sh.yhby.protobuf.MessageProbuf.Message> getMessagesList() {
        if (messagesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(messages_);
        } else {
          return messagesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public int getMessagesCount() {
        if (messagesBuilder_ == null) {
          return messages_.size();
        } else {
          return messagesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public com.sh.yhby.protobuf.MessageProbuf.Message getMessages(int index) {
        if (messagesBuilder_ == null) {
          return messages_.get(index);
        } else {
          return messagesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder setMessages(
          int index, com.sh.yhby.protobuf.MessageProbuf.Message value) {
        if (messagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessagesIsMutable();
          messages_.set(index, value);
          onChanged();
        } else {
          messagesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder setMessages(
          int index, com.sh.yhby.protobuf.MessageProbuf.Message.Builder builderForValue) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          messages_.set(index, builderForValue.build());
          onChanged();
        } else {
          messagesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder addMessages(com.sh.yhby.protobuf.MessageProbuf.Message value) {
        if (messagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessagesIsMutable();
          messages_.add(value);
          onChanged();
        } else {
          messagesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder addMessages(
          int index, com.sh.yhby.protobuf.MessageProbuf.Message value) {
        if (messagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessagesIsMutable();
          messages_.add(index, value);
          onChanged();
        } else {
          messagesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder addMessages(
          com.sh.yhby.protobuf.MessageProbuf.Message.Builder builderForValue) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          messages_.add(builderForValue.build());
          onChanged();
        } else {
          messagesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder addMessages(
          int index, com.sh.yhby.protobuf.MessageProbuf.Message.Builder builderForValue) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          messages_.add(index, builderForValue.build());
          onChanged();
        } else {
          messagesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder addAllMessages(
          java.lang.Iterable<? extends com.sh.yhby.protobuf.MessageProbuf.Message> values) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, messages_);
          onChanged();
        } else {
          messagesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder clearMessages() {
        if (messagesBuilder_ == null) {
          messages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          messagesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public Builder removeMessages(int index) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          messages_.remove(index);
          onChanged();
        } else {
          messagesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public com.sh.yhby.protobuf.MessageProbuf.Message.Builder getMessagesBuilder(
          int index) {
        return getMessagesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder getMessagesOrBuilder(
          int index) {
        if (messagesBuilder_ == null) {
          return messages_.get(index);  } else {
          return messagesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public java.util.List<? extends com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder> 
           getMessagesOrBuilderList() {
        if (messagesBuilder_ != null) {
          return messagesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(messages_);
        }
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public com.sh.yhby.protobuf.MessageProbuf.Message.Builder addMessagesBuilder() {
        return getMessagesFieldBuilder().addBuilder(
            com.sh.yhby.protobuf.MessageProbuf.Message.getDefaultInstance());
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public com.sh.yhby.protobuf.MessageProbuf.Message.Builder addMessagesBuilder(
          int index) {
        return getMessagesFieldBuilder().addBuilder(
            index, com.sh.yhby.protobuf.MessageProbuf.Message.getDefaultInstance());
      }
      /**
       * <code>repeated .protobuf.Message messages = 3;</code>
       */
      public java.util.List<com.sh.yhby.protobuf.MessageProbuf.Message.Builder> 
           getMessagesBuilderList() {
        return getMessagesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.sh.yhby.protobuf.MessageProbuf.Message, com.sh.yhby.protobuf.MessageProbuf.Message.Builder, com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder> 
          getMessagesFieldBuilder() {
        if (messagesBuilder_ == null) {
          messagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.sh.yhby.protobuf.MessageProbuf.Message, com.sh.yhby.protobuf.MessageProbuf.Message.Builder, com.sh.yhby.protobuf.MessageProbuf.MessageOrBuilder>(
                  messages_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          messages_ = null;
        }
        return messagesBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:protobuf.Action)
    }

    static {
      defaultInstance = new Action(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protobuf.Action)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_Action_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_Action_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014action.proto\022\010protobuf\032\020actiontype.pro" +
      "to\032\rmessage.proto\"h\n\006Action\022(\n\nactionTyp" +
      "e\030\001 \001(\0162\024.protobuf.ActionType\022\017\n\005token\030\002" +
      " \001(\t:\000\022#\n\010messages\030\003 \003(\0132\021.protobuf.Mess" +
      "ageB$\n\024com.sh.yhby.protobufB\014ActionProbu" +
      "f"
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
          com.sh.yhby.protobuf.ActionTypeProbuf.getDescriptor(),
          com.sh.yhby.protobuf.MessageProbuf.getDescriptor(),
        }, assigner);
    internal_static_protobuf_Action_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_Action_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protobuf_Action_descriptor,
        new java.lang.String[] { "ActionType", "Token", "Messages", });
    com.sh.yhby.protobuf.ActionTypeProbuf.getDescriptor();
    com.sh.yhby.protobuf.MessageProbuf.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
