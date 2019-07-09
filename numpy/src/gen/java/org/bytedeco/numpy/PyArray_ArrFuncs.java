// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_ArrFuncs extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArray_ArrFuncs() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArray_ArrFuncs(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArray_ArrFuncs(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArray_ArrFuncs position(long position) {
        return (PyArray_ArrFuncs)super.position(position);
    }

        /*
         * Functions to cast to most other standard types
         * Can have some NULL entries. The types
         * DATETIME, TIMEDELTA, and HALF go into the castdict
         * even though they are built-in.
         */
        public native PyArray_VectorUnaryFunc cast(int i); public native PyArray_ArrFuncs cast(int i, PyArray_VectorUnaryFunc setter);
        @MemberGetter public native @Cast("PyArray_VectorUnaryFunc**") PointerPointer cast();

        /* The next four functions *cannot* be NULL */

        /*
         * Functions to get and set items with standard Python types
         * -- not array scalars
         */
        public native PyArray_GetItemFunc getitem(); public native PyArray_ArrFuncs getitem(PyArray_GetItemFunc setter);
        public native PyArray_SetItemFunc setitem(); public native PyArray_ArrFuncs setitem(PyArray_SetItemFunc setter);

        /*
         * Copy and/or swap data.  Memory areas may not overlap
         * Use memmove first if they might
         */
        public native PyArray_CopySwapNFunc copyswapn(); public native PyArray_ArrFuncs copyswapn(PyArray_CopySwapNFunc setter);
        public native PyArray_CopySwapFunc copyswap(); public native PyArray_ArrFuncs copyswap(PyArray_CopySwapFunc setter);

        /*
         * Function to compare items
         * Can be NULL
         */
        public native PyArray_CompareFunc compare(); public native PyArray_ArrFuncs compare(PyArray_CompareFunc setter);

        /*
         * Function to select largest
         * Can be NULL
         */
        public native PyArray_ArgFunc argmax(); public native PyArray_ArrFuncs argmax(PyArray_ArgFunc setter);

        /*
         * Function to compute dot product
         * Can be NULL
         */
        public native PyArray_DotFunc dotfunc(); public native PyArray_ArrFuncs dotfunc(PyArray_DotFunc setter);

        /*
         * Function to scan an ASCII file and
         * place a single value plus possible separator
         * Can be NULL
         */
        public native PyArray_ScanFunc scanfunc(); public native PyArray_ArrFuncs scanfunc(PyArray_ScanFunc setter);

        /*
         * Function to read a single value from a string
         * and adjust the pointer; Can be NULL
         */
        public native PyArray_FromStrFunc fromstr(); public native PyArray_ArrFuncs fromstr(PyArray_FromStrFunc setter);

        /*
         * Function to determine if data is zero or not
         * If NULL a default version is
         * used at Registration time.
         */
        public native PyArray_NonzeroFunc nonzero(); public native PyArray_ArrFuncs nonzero(PyArray_NonzeroFunc setter);

        /*
         * Used for arange. Should return 0 on success
         * and -1 on failure.
         * Can be NULL.
         */
        public native @Name("fill") PyArray_FillFunc _fill(); public native PyArray_ArrFuncs _fill(PyArray_FillFunc setter);

        /*
         * Function to fill arrays with scalar values
         * Can be NULL
         */
        public native PyArray_FillWithScalarFunc fillwithscalar(); public native PyArray_ArrFuncs fillwithscalar(PyArray_FillWithScalarFunc setter);

        /*
         * Sorting functions
         * Can be NULL
         */
        public native PyArray_SortFunc sort(int i); public native PyArray_ArrFuncs sort(int i, PyArray_SortFunc setter);
        @MemberGetter public native @Cast("PyArray_SortFunc**") PointerPointer sort();
        public native PyArray_ArgSortFunc argsort(int i); public native PyArray_ArrFuncs argsort(int i, PyArray_ArgSortFunc setter);
        @MemberGetter public native @Cast("PyArray_ArgSortFunc**") PointerPointer argsort();

        /*
         * Dictionary of additional casting functions
         * PyArray_VectorUnaryFuncs
         * which can be populated to support casting
         * to other registered types. Can be NULL
         */
        public native PyObject castdict(); public native PyArray_ArrFuncs castdict(PyObject setter);

        /*
         * Functions useful for generalizing
         * the casting rules.
         * Can be NULL;
         */
        public native PyArray_ScalarKindFunc scalarkind(); public native PyArray_ArrFuncs scalarkind(PyArray_ScalarKindFunc setter);
        public native IntPointer cancastscalarkindto(int i); public native PyArray_ArrFuncs cancastscalarkindto(int i, IntPointer setter);
        public native @Cast("int**") PointerPointer cancastscalarkindto(); public native PyArray_ArrFuncs cancastscalarkindto(PointerPointer setter);
        public native IntPointer cancastto(); public native PyArray_ArrFuncs cancastto(IntPointer setter);

        public native PyArray_FastClipFunc fastclip(); public native PyArray_ArrFuncs fastclip(PyArray_FastClipFunc setter);
        public native PyArray_FastPutmaskFunc fastputmask(); public native PyArray_ArrFuncs fastputmask(PyArray_FastPutmaskFunc setter);
        public native PyArray_FastTakeFunc fasttake(); public native PyArray_ArrFuncs fasttake(PyArray_FastTakeFunc setter);

        /*
         * Function to select smallest
         * Can be NULL
         */
        public native PyArray_ArgFunc argmin(); public native PyArray_ArrFuncs argmin(PyArray_ArgFunc setter);

}
