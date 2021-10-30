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

@NoOffset @Name("c10::optional<c10::IValue>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IValueOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IValueOptional(Pointer p) { super(p); }
    public IValueOptional(IValue value) { this(); put(value); }
    public IValueOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef IValueOptional put(@ByRef IValueOptional x);


    @Name("value") public native @ByRef IValue get();
    @ValueSetter public native IValueOptional put(@ByRef IValue value);
}
