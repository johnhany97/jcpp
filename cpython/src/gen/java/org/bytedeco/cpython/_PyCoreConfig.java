// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;



@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyCoreConfig extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyCoreConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyCoreConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyCoreConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyCoreConfig position(long position) {
        return (_PyCoreConfig)super.position(position);
    }

    public native int install_signal_handlers(); public native _PyCoreConfig install_signal_handlers(int setter);  /* Install signal handlers? -1 means unset */

    public native int ignore_environment(); public native _PyCoreConfig ignore_environment(int setter); /* -E, Py_IgnoreEnvironmentFlag */
    public native int use_hash_seed(); public native _PyCoreConfig use_hash_seed(int setter);      /* PYTHONHASHSEED=x */
    public native @Cast("unsigned long") long hash_seed(); public native _PyCoreConfig hash_seed(long setter);
    public native @Cast("const char*") BytePointer allocator(); public native _PyCoreConfig allocator(BytePointer setter);  /* Memory allocator: _PyMem_SetupAllocators() */
    public native int dev_mode(); public native _PyCoreConfig dev_mode(int setter);           /* PYTHONDEVMODE, -X dev */
    public native int faulthandler(); public native _PyCoreConfig faulthandler(int setter);       /* PYTHONFAULTHANDLER, -X faulthandler */
    public native int tracemalloc(); public native _PyCoreConfig tracemalloc(int setter);        /* PYTHONTRACEMALLOC, -X tracemalloc=N */
    public native int import_time(); public native _PyCoreConfig import_time(int setter);        /* PYTHONPROFILEIMPORTTIME, -X importtime */
    public native int show_ref_count(); public native _PyCoreConfig show_ref_count(int setter);     /* -X showrefcount */
    public native int show_alloc_count(); public native _PyCoreConfig show_alloc_count(int setter);   /* -X showalloccount */
    public native int dump_refs(); public native _PyCoreConfig dump_refs(int setter);          /* PYTHONDUMPREFS */
    public native int malloc_stats(); public native _PyCoreConfig malloc_stats(int setter);       /* PYTHONMALLOCSTATS */
    public native int coerce_c_locale(); public native _PyCoreConfig coerce_c_locale(int setter);    /* PYTHONCOERCECLOCALE, -1 means unknown */
    public native int coerce_c_locale_warn(); public native _PyCoreConfig coerce_c_locale_warn(int setter); /* PYTHONCOERCECLOCALE=warn */
    public native int utf8_mode(); public native _PyCoreConfig utf8_mode(int setter);          /* PYTHONUTF8, -X utf8; -1 means unknown */

    public native @Cast("wchar_t*") Pointer program_name(); public native _PyCoreConfig program_name(Pointer setter);  /* Program name, see also Py_GetProgramName() */
    public native int argc(); public native _PyCoreConfig argc(int setter);               /* Number of command line arguments,
                               -1 means unset */
    public native @Cast("wchar_t*") Pointer argv(int i); public native _PyCoreConfig argv(int i, Pointer setter);
    public native @Cast("wchar_t**") PointerPointer argv(); public native _PyCoreConfig argv(PointerPointer setter);         /* Command line arguments */
    public native @Cast("wchar_t*") Pointer program(); public native _PyCoreConfig program(Pointer setter);       /* argv[0] or "" */

    public native int nxoption(); public native _PyCoreConfig nxoption(int setter);           /* Number of -X options */
    public native @Cast("wchar_t*") Pointer xoptions(int i); public native _PyCoreConfig xoptions(int i, Pointer setter);
    public native @Cast("wchar_t**") PointerPointer xoptions(); public native _PyCoreConfig xoptions(PointerPointer setter);     /* -X options */

    public native int nwarnoption(); public native _PyCoreConfig nwarnoption(int setter);        /* Number of warnings options */
    public native @Cast("wchar_t*") Pointer warnoptions(int i); public native _PyCoreConfig warnoptions(int i, Pointer setter);
    public native @Cast("wchar_t**") PointerPointer warnoptions(); public native _PyCoreConfig warnoptions(PointerPointer setter);  /* Warnings options */

    /* Path configuration inputs */
    public native @Cast("wchar_t*") Pointer module_search_path_env(); public native _PyCoreConfig module_search_path_env(Pointer setter); /* PYTHONPATH environment variable */
    public native @Cast("wchar_t*") Pointer home(); public native _PyCoreConfig home(Pointer setter);          /* PYTHONHOME environment variable,
                               see also Py_SetPythonHome(). */

    /* Path configuration outputs */
    public native int nmodule_search_path(); public native _PyCoreConfig nmodule_search_path(int setter);        /* Number of sys.path paths,
                                       -1 means unset */
    public native @Cast("wchar_t*") Pointer module_search_paths(int i); public native _PyCoreConfig module_search_paths(int i, Pointer setter);
    public native @Cast("wchar_t**") PointerPointer module_search_paths(); public native _PyCoreConfig module_search_paths(PointerPointer setter);  /* sys.path paths */
    public native @Cast("wchar_t*") Pointer executable(); public native _PyCoreConfig executable(Pointer setter);    /* sys.executable */
    public native @Cast("wchar_t*") Pointer prefix(); public native _PyCoreConfig prefix(Pointer setter);        /* sys.prefix */
    public native @Cast("wchar_t*") Pointer base_prefix(); public native _PyCoreConfig base_prefix(Pointer setter);   /* sys.base_prefix */
    public native @Cast("wchar_t*") Pointer exec_prefix(); public native _PyCoreConfig exec_prefix(Pointer setter);   /* sys.exec_prefix */
    public native @Cast("wchar_t*") Pointer base_exec_prefix(); public native _PyCoreConfig base_exec_prefix(Pointer setter);  /* sys.base_exec_prefix */

    /* Private fields */
    public native int _disable_importlib(); public native _PyCoreConfig _disable_importlib(int setter); /* Needed by freeze_importlib */
}
