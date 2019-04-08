// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.caffe.global.caffe.*;
  // namespace internal

// Describes a type of protocol message, or a particular group within a
// message.  To obtain the Descriptor for a given message object, call
// Message::GetDescriptor().  Generated message classes also have a
// static method called descriptor() which returns the type's descriptor.
// Use DescriptorPool to construct your own descriptors.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class Descriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Descriptor(Pointer p) { super(p); }

  // The name of the message type, not including its scope.
  public native @StdString BytePointer name();

  // The fully-qualified name of the message type, scope delimited by
  // periods.  For example, message type "Foo" which is declared in package
  // "bar" has full name "bar.Foo".  If a type "Baz" is nested within
  // Foo, Baz's full_name is "bar.Foo.Baz".  To get only the part that
  // comes after the last '.', use name().
  public native @StdString BytePointer full_name();

  // Index of this descriptor within the file or containing type's message
  // type array.
  public native int index();

  // The .proto file in which this message type was defined.  Never NULL.
  public native @Const FileDescriptor file();

  // If this Descriptor describes a nested type, this returns the type
  // in which it is nested.  Otherwise, returns NULL.
  public native @Const Descriptor containing_type();

  // Get options for this message type.  These are specified in the .proto file
  // by placing lines like "option foo = 1234;" in the message definition.
  // Allowed options are defined by MessageOptions in
  // google/protobuf/descriptor.proto, and any available extensions of that
  // message.
  public native @Const @ByRef MessageOptions options();

  // Write the contents of this Descriptor into the given DescriptorProto.
  // The target DescriptorProto must be clear before calling this; if it
  // isn't, the result may be garbage.
  public native void CopyTo(DescriptorProto proto);

  // Write the contents of this decriptor in a human-readable form. Output
  // will be suitable for re-parsing.
  public native @StdString BytePointer DebugString();

  // Similar to DebugString(), but additionally takes options (e.g.,
  // include original user comments in output).
  public native @StdString BytePointer DebugStringWithOptions(@Const @ByRef DebugStringOptions options);

  // Returns true if this is a placeholder for an unknown type. This will
  // only be the case if this descriptor comes from a DescriptorPool
  // with AllowUnknownDependencies() set.
  public native @Cast("bool") boolean is_placeholder();

  // Field stuff -----------------------------------------------------

  // The number of fields in this message type.
  public native int field_count();
  // Gets a field by index, where 0 <= index < field_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const FieldDescriptor field(int index);

  // Looks up a field by declared tag number.  Returns NULL if no such field
  // exists.
  public native @Const FieldDescriptor FindFieldByNumber(int number);
  // Looks up a field by name.  Returns NULL if no such field exists.
  public native @Const FieldDescriptor FindFieldByName(@StdString BytePointer name);
  public native @Const FieldDescriptor FindFieldByName(@StdString String name);

  // Looks up a field by lowercased name (as returned by lowercase_name()).
  // This lookup may be ambiguous if multiple field names differ only by case,
  // in which case the field returned is chosen arbitrarily from the matches.
  public native @Const FieldDescriptor FindFieldByLowercaseName(
        @StdString BytePointer lowercase_name);
  public native @Const FieldDescriptor FindFieldByLowercaseName(
        @StdString String lowercase_name);

  // Looks up a field by camel-case name (as returned by camelcase_name()).
  // This lookup may be ambiguous if multiple field names differ in a way that
  // leads them to have identical camel-case names, in which case the field
  // returned is chosen arbitrarily from the matches.
  public native @Const FieldDescriptor FindFieldByCamelcaseName(
        @StdString BytePointer camelcase_name);
  public native @Const FieldDescriptor FindFieldByCamelcaseName(
        @StdString String camelcase_name);

  // The number of oneofs in this message type.
  public native int oneof_decl_count();
  // Get a oneof by index, where 0 <= index < oneof_decl_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const OneofDescriptor oneof_decl(int index);

  // Looks up a oneof by name.  Returns NULL if no such oneof exists.
  public native @Const OneofDescriptor FindOneofByName(@StdString BytePointer name);
  public native @Const OneofDescriptor FindOneofByName(@StdString String name);

  // Nested type stuff -----------------------------------------------

  // The number of nested types in this message type.
  public native int nested_type_count();
  // Gets a nested type by index, where 0 <= index < nested_type_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const Descriptor nested_type(int index);

  // Looks up a nested type by name.  Returns NULL if no such nested type
  // exists.
  public native @Const Descriptor FindNestedTypeByName(@StdString BytePointer name);
  public native @Const Descriptor FindNestedTypeByName(@StdString String name);

  // Enum stuff ------------------------------------------------------

  // The number of enum types in this message type.
  public native int enum_type_count();
  // Gets an enum type by index, where 0 <= index < enum_type_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const EnumDescriptor enum_type(int index);

  // Looks up an enum type by name.  Returns NULL if no such enum type exists.
  public native @Const EnumDescriptor FindEnumTypeByName(@StdString BytePointer name);
  public native @Const EnumDescriptor FindEnumTypeByName(@StdString String name);

  // Looks up an enum value by name, among all enum types in this message.
  // Returns NULL if no such value exists.
  public native @Const EnumValueDescriptor FindEnumValueByName(@StdString BytePointer name);
  public native @Const EnumValueDescriptor FindEnumValueByName(@StdString String name);

  // Extensions ------------------------------------------------------

  // A range of field numbers which are designated for third-party
  // extensions.
  public static class ExtensionRange extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public ExtensionRange() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public ExtensionRange(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public ExtensionRange(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public ExtensionRange position(long position) {
          return (ExtensionRange)super.position(position);
      }
  

    // See Descriptor::CopyTo().
    public native void CopyTo(DescriptorProto_ExtensionRange proto);

    public native int start(); public native ExtensionRange start(int setter);  // inclusive
    public native int end(); public native ExtensionRange end(int setter);    // exclusive

    @MemberGetter public native @Const ExtensionRangeOptions options_();
  }

  // The number of extension ranges in this message type.
  public native int extension_range_count();
  // Gets an extension range by index, where 0 <= index <
  // extension_range_count(). These are returned in the order they were defined
  // in the .proto file.
  public native @Const ExtensionRange extension_range(int index);

  // Returns true if the number is in one of the extension ranges.
  public native @Cast("bool") boolean IsExtensionNumber(int number);

  // Returns NULL if no extension range contains the given number.
  public native @Const ExtensionRange FindExtensionRangeContainingNumber(int number);

  // The number of extensions -- extending *other* messages -- that were
  // defined nested within this message type's scope.
  public native int extension_count();
  // Get an extension by index, where 0 <= index < extension_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const FieldDescriptor extension(int index);

  // Looks up a named extension (which extends some *other* message type)
  // defined within this message type's scope.
  public native @Const FieldDescriptor FindExtensionByName(@StdString BytePointer name);
  public native @Const FieldDescriptor FindExtensionByName(@StdString String name);

  // Similar to FindFieldByLowercaseName(), but finds extensions defined within
  // this message type's scope.
  public native @Const FieldDescriptor FindExtensionByLowercaseName(@StdString BytePointer name);
  public native @Const FieldDescriptor FindExtensionByLowercaseName(@StdString String name);

  // Similar to FindFieldByCamelcaseName(), but finds extensions defined within
  // this message type's scope.
  public native @Const FieldDescriptor FindExtensionByCamelcaseName(@StdString BytePointer name);
  public native @Const FieldDescriptor FindExtensionByCamelcaseName(@StdString String name);

  // Reserved fields -------------------------------------------------

  // A range of reserved field numbers.
  public static class ReservedRange extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public ReservedRange() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public ReservedRange(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public ReservedRange(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public ReservedRange position(long position) {
          return (ReservedRange)super.position(position);
      }
  
    public native int start(); public native ReservedRange start(int setter);  // inclusive
    public native int end(); public native ReservedRange end(int setter);    // exclusive
  }

  // The number of reserved ranges in this message type.
  public native int reserved_range_count();
  // Gets an reserved range by index, where 0 <= index <
  // reserved_range_count(). These are returned in the order they were defined
  // in the .proto file.
  public native @Const ReservedRange reserved_range(int index);

  // Returns true if the number is in one of the reserved ranges.
  public native @Cast("bool") boolean IsReservedNumber(int number);

  // Returns NULL if no reserved range contains the given number.
  public native @Const ReservedRange FindReservedRangeContainingNumber(int number);

  // The number of reserved field names in this message type.
  public native int reserved_name_count();

  // Gets a reserved name by index, where 0 <= index < reserved_name_count().
  public native @StdString BytePointer reserved_name(int index);

  // Returns true if the field name is reserved.
  public native @Cast("bool") boolean IsReservedName(@StdString BytePointer name);
  public native @Cast("bool") boolean IsReservedName(@StdString String name);

  // Source Location ---------------------------------------------------

  // Updates |*out_location| to the source location of the complete
  // extent of this message declaration.  Returns false and leaves
  // |*out_location| unchanged iff location information was not available.
  public native @Cast("bool") boolean GetSourceLocation(SourceLocation out_location);
}
