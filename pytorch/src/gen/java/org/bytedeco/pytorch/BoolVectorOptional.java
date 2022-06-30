// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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

@NoOffset @Name("c10::optional<std::vector<bool> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BoolVectorOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoolVectorOptional(Pointer p) { super(p); }
    public BoolVectorOptional(BoolVector value) { this(); put(value); }
    public BoolVectorOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef BoolVectorOptional put(@ByRef BoolVectorOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef BoolVector get();
    @ValueSetter public native BoolVectorOptional put(@ByRef BoolVector value);
}

