// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class FloatType
    \brief FloatType is a derivative of a DataType and operates on HDF5
    floating point datatype.
*/
//  Inheritance: AtomType -> DataType -> H5Object -> H5Location -> IdComponent
@Namespace("H5") @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class FloatType extends AtomType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatType(Pointer p) { super(p); }

        // Creates a floating-point type using a predefined type.
        public FloatType(@Const @ByRef PredType pred_type) { super((Pointer)null); allocate(pred_type); }
        private native void allocate(@Const @ByRef PredType pred_type);

        // Gets the floating-point datatype of the specified dataset.
        public FloatType(@Const @ByRef DataSet dataset) { super((Pointer)null); allocate(dataset); }
        private native void allocate(@Const @ByRef DataSet dataset);

        // Constructors that open an HDF5 float datatype, given a location.
        public FloatType(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name) { super((Pointer)null); allocate(loc, name); }
        private native void allocate(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name);
        public FloatType(@Const @ByRef H5Location loc, String name) { super((Pointer)null); allocate(loc, name); }
        private native void allocate(@Const @ByRef H5Location loc, String name);

        // Returns an FloatType object via DataType* by decoding the
        // binary object description of this type.
        public native DataType decode();

        // Retrieves the exponent bias of a floating-point type.
        public native @Cast("size_t") long getEbias();

        // Sets the exponent bias of a floating-point type.
        public native void setEbias(@Cast("size_t") long ebias);

        // Retrieves floating point datatype bit field information.
        public native void getFields(@Cast("size_t*") @ByRef SizeTPointer spos, @Cast("size_t*") @ByRef SizeTPointer epos, @Cast("size_t*") @ByRef SizeTPointer esize, @Cast("size_t*") @ByRef SizeTPointer mpos, @Cast("size_t*") @ByRef SizeTPointer msize);

        // Sets locations and sizes of floating point bit fields.
        public native void setFields(@Cast("size_t") long spos, @Cast("size_t") long epos, @Cast("size_t") long esize, @Cast("size_t") long mpos, @Cast("size_t") long msize);

        // Retrieves the internal padding type for unused bits in floating-point datatypes.
        public native @Cast("H5T_pad_t") int getInpad(@StdString @ByRef BytePointer pad_string);

        // Fills unused internal floating point bits.
        public native void setInpad(@Cast("H5T_pad_t") int inpad);

        // Retrieves mantissa normalization of a floating-point datatype.
        public native @Cast("H5T_norm_t") int getNorm(@StdString @ByRef BytePointer norm_string);

        // Sets the mantissa normalization of a floating-point datatype.
        public native void setNorm(@Cast("H5T_norm_t") int norm);

        /**\brief Returns this class name. */
        public native @StdString BytePointer fromClass();

        // Default constructor
        public FloatType() { super((Pointer)null); allocate(); }
        private native void allocate();

        // Creates a floating-point datatype using an existing id.
        public FloatType(@Cast("const hid_t") long existing_id) { super((Pointer)null); allocate(existing_id); }
        private native void allocate(@Cast("const hid_t") long existing_id);

        // Copy constructor: same as the original FloatType.
        public FloatType(@Const @ByRef FloatType original) { super((Pointer)null); allocate(original); }
        private native void allocate(@Const @ByRef FloatType original);

        // Noop destructor.

}
