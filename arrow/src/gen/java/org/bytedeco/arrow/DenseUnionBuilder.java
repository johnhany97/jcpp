// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class DenseUnionBuilder
 * 
 *  This API is EXPERIMENTAL. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DenseUnionBuilder extends BasicUnionBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DenseUnionBuilder(Pointer p) { super(p); }

  /** Use this constructor to initialize the UnionBuilder with no child builders,
   *  allowing type to be inferred. You will need to call AppendChild for each of the
   *  children builders you want to use. */
  public DenseUnionBuilder(MemoryPool pool) { super((Pointer)null); allocate(pool); }
  private native void allocate(MemoryPool pool);

  /** Use this constructor to specify the type explicitly.
   *  You can still add child builders to the union after using this constructor */
  public DenseUnionBuilder(MemoryPool pool,
                      @Const @ByRef ArrayBuilderVector children,
                      @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(pool, children, type); }
  private native void allocate(MemoryPool pool,
                      @Const @ByRef ArrayBuilderVector children,
                      @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @ByVal Status AppendNull();

  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  public native @ByVal Status AppendEmptyValue();

  
  ///
  ///
  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  /** \brief Append an element to the UnionArray. This must be followed
   *         by an append to the appropriate child builder.
   * 
   *  @param next_type [in] type_id of the child to which the next value will be appended.
   * 
   *  The corresponding child builder must be appended to independently after this method
   *  is called. */
  public native @ByVal Status Append(byte next_type);

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);
}
