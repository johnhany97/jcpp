// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

  @Name("tensorflow::IsValidDataType<float>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class IsValidDataType extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public IsValidDataType() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public IsValidDataType(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public IsValidDataType(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public IsValidDataType position(long position) {
          return (IsValidDataType)super.position(position);
      }
  
    @MemberGetter public static native @Cast("const bool") boolean value();
    public static final boolean value = value();
  }
