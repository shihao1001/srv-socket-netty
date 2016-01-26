// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msgtype.proto

package com.sh.yhby.protobuf;

public final class MsgTypeProbuf {
  private MsgTypeProbuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code protobuf.MsgType}
   */
  public enum MsgType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TEXT_MESSAGE = 1;</code>
     */
    TEXT_MESSAGE(0, 1),
    /**
     * <code>IMAGE_MESSAGE = 2;</code>
     */
    IMAGE_MESSAGE(1, 2),
    /**
     * <code>LOCATION_MESSAGE = 3;</code>
     */
    LOCATION_MESSAGE(2, 3),
    ;

    /**
     * <code>TEXT_MESSAGE = 1;</code>
     */
    public static final int TEXT_MESSAGE_VALUE = 1;
    /**
     * <code>IMAGE_MESSAGE = 2;</code>
     */
    public static final int IMAGE_MESSAGE_VALUE = 2;
    /**
     * <code>LOCATION_MESSAGE = 3;</code>
     */
    public static final int LOCATION_MESSAGE_VALUE = 3;


    public final int getNumber() { return value; }

    public static MsgType valueOf(int value) {
      switch (value) {
        case 1: return TEXT_MESSAGE;
        case 2: return IMAGE_MESSAGE;
        case 3: return LOCATION_MESSAGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MsgType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<MsgType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MsgType>() {
            public MsgType findValueByNumber(int number) {
              return MsgType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.sh.yhby.protobuf.MsgTypeProbuf.getDescriptor().getEnumTypes().get(0);
    }

    private static final MsgType[] VALUES = values();

    public static MsgType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private MsgType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protobuf.MsgType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmsgtype.proto\022\010protobuf*D\n\007MsgType\022\020\n\014" +
      "TEXT_MESSAGE\020\001\022\021\n\rIMAGE_MESSAGE\020\002\022\024\n\020LOC" +
      "ATION_MESSAGE\020\003B%\n\024com.sh.yhby.protobufB" +
      "\rMsgTypeProbuf"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}