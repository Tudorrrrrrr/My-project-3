// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartbuildingwater.proto

package grpc.examples.smartbuildingwater;

public final class smartbuildingwaterServiceImpl {
  private smartbuildingwaterServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartbuildingwater_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartbuildingwater_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartbuildingwater_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartbuildingwater_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030smartbuildingwater.proto\022\022smartbuildin" +
      "gwater\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"\035\n\n" +
      "HelloReply\022\017\n\007message\030\001 \001(\t2Y\n\007Greeter\022N" +
      "\n\010SayHello\022 .smartbuildingwater.HelloReq" +
      "uest\032\036.smartbuildingwater.HelloReply\"\000BC" +
      "\n grpc.examples.smartbuildingwaterB\035smar" +
      "tbuildingwaterServiceImplP\001b\006proto3"
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
    internal_static_smartbuildingwater_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartbuildingwater_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartbuildingwater_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_smartbuildingwater_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartbuildingwater_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartbuildingwater_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
