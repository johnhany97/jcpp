// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at::indexing") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Slice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Slice(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Slice(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Slice position(long position) {
        return (Slice)super.position(position);
    }
    @Override public Slice getPointer(long i) {
        return new Slice((Pointer)this).offsetAddress(i);
    }

  // This mirrors `__PySlice_Unpack` in torch/csrc/utils/python_compat.h
  public Slice(
      @ByVal(nullValue = "c10::optional<int64_t>(c10::nullopt)") LongOptional start_index,
      @ByVal(nullValue = "c10::optional<int64_t>(c10::nullopt)") LongOptional stop_index,
      @ByVal(nullValue = "c10::optional<int64_t>(c10::nullopt)") LongOptional step_index) { super((Pointer)null); allocate(start_index, stop_index, step_index); }
  private native void allocate(
      @ByVal(nullValue = "c10::optional<int64_t>(c10::nullopt)") LongOptional start_index,
      @ByVal(nullValue = "c10::optional<int64_t>(c10::nullopt)") LongOptional stop_index,
      @ByVal(nullValue = "c10::optional<int64_t>(c10::nullopt)") LongOptional step_index);
  public Slice() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("int64_t") long start();

  public native @Cast("int64_t") long stop();

  public native @Cast("int64_t") long step();
}