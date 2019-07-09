// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


// Describes an individual enum constant of a particular type.  To get the
// EnumValueDescriptor for a given enum value, first get the EnumDescriptor
// for its type, then use EnumDescriptor::FindValueByName() or
// EnumDescriptor::FindValueByNumber().  Use DescriptorPool to construct
// your own descriptors.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class EnumValueDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnumValueDescriptor(Pointer p) { super(p); }


  public native @StdString BytePointer name();  // Name of this enum constant.
  public native int index();           // Index within the enums's Descriptor.
  public native int number();          // Numeric value of this enum constant.

  // The full_name of an enum value is a sibling symbol of the enum type.
  // e.g. the full name of FieldDescriptorProto::TYPE_INT32 is actually
  // "google.protobuf.FieldDescriptorProto.TYPE_INT32", NOT
  // "google.protobuf.FieldDescriptorProto.Type.TYPE_INT32".  This is to conform
  // with C++ scoping rules for enums.
  public native @StdString BytePointer full_name();

  // The .proto file in which this value was defined.  Never NULL.
  public native @Const FileDescriptor file();
  // The type of this value.  Never NULL.
  public native @Const EnumDescriptor type();

  // Get options for this enum value.  These are specified in the .proto file by
  // adding text like "[foo = 1234]" after an enum value definition.  Allowed
  // options are defined by EnumValueOptions in descriptor.proto, and any
  // available extensions of that message.
  public native @Const @ByRef EnumValueOptions options();

  // See Descriptor::CopyTo().
  public native void CopyTo(EnumValueDescriptorProto proto);

  // See Descriptor::DebugString().
  public native @StdString BytePointer DebugString();

  // See Descriptor::DebugStringWithOptions().
  public native @StdString BytePointer DebugStringWithOptions(@Const @ByRef DebugStringOptions options);


  // Source Location ---------------------------------------------------

  // Updates |*out_location| to the source location of the complete
  // extent of this enum value declaration.  Returns false and leaves
  // |*out_location| unchanged iff location information was not available.
  public native @Cast("bool") boolean GetSourceLocation(SourceLocation out_location);
}
