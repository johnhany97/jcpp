// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Converts each string in the input Tensor to its hash mod by a number of buckets.
 * 
 *  The hash function is deterministic on the content of the string within the
 *  process and will never change. However, it is not suitable for cryptography.
 *  This function may be used when CPU time is scarce and inputs are trusted or
 *  unimportant. There is a risk of adversaries constructing inputs that all hash
 *  to the same bucket. To prevent this problem, use a strong hash function with
 *  {@code tf.string_to_hash_bucket_strong}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The strings to assign a hash bucket.
 *  * num_buckets: The number of buckets.
 * 
 *  Returns:
 *  * {@code Output}: A Tensor of the same shape as the input {@code string_tensor}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringToHashBucketFast extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringToHashBucketFast(Pointer p) { super(p); }

  public StringToHashBucketFast(@Const @ByRef Scope scope, @ByVal Input input, @Cast("tensorflow::int64") long num_buckets) { super((Pointer)null); allocate(scope, input, num_buckets); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Cast("tensorflow::int64") long num_buckets);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native StringToHashBucketFast operation(Operation setter);
  public native @ByRef Output output(); public native StringToHashBucketFast output(Output setter);
}
