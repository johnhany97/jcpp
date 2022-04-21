// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;
  // namespace delegates

@Namespace("tflite") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Subgraph extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Subgraph(Pointer p) { super(p); }


  public Subgraph(ErrorReporter error_reporter,
             @Cast("TfLiteExternalContext**") PointerPointer external_contexts,
             SubgraphVector subgraphs,
             @Cast("tflite::resource::ResourceMap*") IntResourceBaseMap resources,
             @Cast("tflite::resource::ResourceIDMap*") StringIntMap resource_ids,
             @Cast("tflite::resource::InitializationStatusMap*") IntResourceBaseMap initialization_status_map) { super((Pointer)null); allocate(error_reporter, external_contexts, subgraphs, resources, resource_ids, initialization_status_map); }
  private native void allocate(ErrorReporter error_reporter,
             @Cast("TfLiteExternalContext**") PointerPointer external_contexts,
             SubgraphVector subgraphs,
             @Cast("tflite::resource::ResourceMap*") IntResourceBaseMap resources,
             @Cast("tflite::resource::ResourceIDMap*") StringIntMap resource_ids,
             @Cast("tflite::resource::InitializationStatusMap*") IntResourceBaseMap initialization_status_map);
  public Subgraph(ErrorReporter error_reporter,
             @ByPtrPtr TfLiteExternalContext external_contexts,
             SubgraphVector subgraphs,
             @Cast("tflite::resource::ResourceMap*") IntResourceBaseMap resources,
             @Cast("tflite::resource::ResourceIDMap*") StringIntMap resource_ids,
             @Cast("tflite::resource::InitializationStatusMap*") IntResourceBaseMap initialization_status_map) { super((Pointer)null); allocate(error_reporter, external_contexts, subgraphs, resources, resource_ids, initialization_status_map); }
  private native void allocate(ErrorReporter error_reporter,
             @ByPtrPtr TfLiteExternalContext external_contexts,
             SubgraphVector subgraphs,
             @Cast("tflite::resource::ResourceMap*") IntResourceBaseMap resources,
             @Cast("tflite::resource::ResourceIDMap*") StringIntMap resource_ids,
             @Cast("tflite::resource::InitializationStatusMap*") IntResourceBaseMap initialization_status_map);

  

  // Subgraphs should be movable but not copyable.
  public Subgraph(@StdMove Subgraph arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@StdMove Subgraph arg0);
  

  // Provide a list of tensor indexes that are inputs to the model.
  // Each index is bound check and this modifies the consistent_ flag of the
  // interpreter.
  public native @Cast("TfLiteStatus") int SetInputs(@StdVector IntPointer inputs);
  public native @Cast("TfLiteStatus") int SetInputs(@StdVector IntBuffer inputs);
  public native @Cast("TfLiteStatus") int SetInputs(@StdVector int[] inputs);

  // Provide a list of tensor indexes that are outputs to the model
  // Each index is bound check and this modifies the consistent_ flag of the
  // interpreter.
  public native @Cast("TfLiteStatus") int SetOutputs(@StdVector IntPointer outputs);
  public native @Cast("TfLiteStatus") int SetOutputs(@StdVector IntBuffer outputs);
  public native @Cast("TfLiteStatus") int SetOutputs(@StdVector int[] outputs);

  // Provide a list of tensor indexes that are variable tensors.
  // Each index is bound check and this modifies the consistent_ flag of the
  // interpreter.
  public native @Cast("TfLiteStatus") int SetVariables(@StdVector IntPointer variables);
  public native @Cast("TfLiteStatus") int SetVariables(@StdVector IntBuffer variables);
  public native @Cast("TfLiteStatus") int SetVariables(@StdVector int[] variables);

  // Adds a node with the given parameters and returns the index of the new
  // node in `node_index` (optionally). Interpreter will take ownership of
  // `builtin_data` and destroy it with `free`. Ownership of 'init_data'
  // remains with the caller.
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector IntPointer inputs,
                                       @StdVector IntPointer outputs,
                                       @StdVector IntPointer intermediates,
                                       @Cast("const char*") BytePointer init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration,
                                       IntPointer node_index/*=nullptr*/);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector IntPointer inputs,
                                       @StdVector IntPointer outputs,
                                       @StdVector IntPointer intermediates,
                                       @Cast("const char*") BytePointer init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector IntBuffer inputs,
                                       @StdVector IntBuffer outputs,
                                       @StdVector IntBuffer intermediates,
                                       String init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration,
                                       IntBuffer node_index/*=nullptr*/);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector IntBuffer inputs,
                                       @StdVector IntBuffer outputs,
                                       @StdVector IntBuffer intermediates,
                                       String init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector int[] inputs,
                                       @StdVector int[] outputs,
                                       @StdVector int[] intermediates,
                                       @Cast("const char*") BytePointer init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration,
                                       int[] node_index/*=nullptr*/);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector int[] inputs,
                                       @StdVector int[] outputs,
                                       @StdVector int[] intermediates,
                                       @Cast("const char*") BytePointer init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector IntPointer inputs,
                                       @StdVector IntPointer outputs,
                                       @StdVector IntPointer intermediates,
                                       String init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration,
                                       IntPointer node_index/*=nullptr*/);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector IntPointer inputs,
                                       @StdVector IntPointer outputs,
                                       @StdVector IntPointer intermediates,
                                       String init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector IntBuffer inputs,
                                       @StdVector IntBuffer outputs,
                                       @StdVector IntBuffer intermediates,
                                       @Cast("const char*") BytePointer init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration,
                                       IntBuffer node_index/*=nullptr*/);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector IntBuffer inputs,
                                       @StdVector IntBuffer outputs,
                                       @StdVector IntBuffer intermediates,
                                       @Cast("const char*") BytePointer init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector int[] inputs,
                                       @StdVector int[] outputs,
                                       @StdVector int[] intermediates,
                                       String init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration,
                                       int[] node_index/*=nullptr*/);
  public native @Cast("TfLiteStatus") int AddNodeWithParameters(@StdVector int[] inputs,
                                       @StdVector int[] outputs,
                                       @StdVector int[] intermediates,
                                       String init_data,
                                       @Cast("size_t") long init_data_size, Pointer builtin_data,
                                       @Const TfLiteRegistration registration);

  // Adds `tensors_to_add` tensors, preserving pre-existing Tensor entries.
  // The value pointed to by `first_new_tensor_index` will be set to the
  // index of the first new tensor if `first_new_tensor_index` is non-null.
  public native @Cast("TfLiteStatus") int AddTensors(int tensors_to_add,
                            IntPointer first_new_tensor_index/*=nullptr*/);
  public native @Cast("TfLiteStatus") int AddTensors(int tensors_to_add);
  public native @Cast("TfLiteStatus") int AddTensors(int tensors_to_add,
                            IntBuffer first_new_tensor_index/*=nullptr*/);
  public native @Cast("TfLiteStatus") int AddTensors(int tensors_to_add,
                            int[] first_new_tensor_index/*=nullptr*/);

  // Set description of inputs/outputs/data/fptrs for node `node_index`.
  // This variant assumes an external buffer has been allocated of size
  // bytes. The lifetime of buffer must be ensured to be greater or equal
  // to Interpreter. `quantization` ownership is passed to the subgraph.
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector IntPointer dims, @ByVal TfLiteQuantization quantization,
        @Cast("const char*") BytePointer buffer, @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector IntPointer dims, @ByVal TfLiteQuantization quantization,
        @Cast("const char*") BytePointer buffer, @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector IntBuffer dims, @ByVal TfLiteQuantization quantization,
        String buffer, @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector IntBuffer dims, @ByVal TfLiteQuantization quantization,
        String buffer, @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector int[] dims, @ByVal TfLiteQuantization quantization,
        @Cast("const char*") BytePointer buffer, @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector int[] dims, @ByVal TfLiteQuantization quantization,
        @Cast("const char*") BytePointer buffer, @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector IntPointer dims, @ByVal TfLiteQuantization quantization,
        String buffer, @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector IntPointer dims, @ByVal TfLiteQuantization quantization,
        String buffer, @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector IntBuffer dims, @ByVal TfLiteQuantization quantization,
        @Cast("const char*") BytePointer buffer, @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector IntBuffer dims, @ByVal TfLiteQuantization quantization,
        @Cast("const char*") BytePointer buffer, @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector int[] dims, @ByVal TfLiteQuantization quantization,
        String buffer, @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector int[] dims, @ByVal TfLiteQuantization quantization,
        String buffer, @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const IntPointer dims, @ByVal TfLiteQuantization quantization, @Cast("const char*") BytePointer buffer,
        @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const IntPointer dims, @ByVal TfLiteQuantization quantization, @Cast("const char*") BytePointer buffer,
        @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const IntBuffer dims, @ByVal TfLiteQuantization quantization, String buffer,
        @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const IntBuffer dims, @ByVal TfLiteQuantization quantization, String buffer,
        @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const int[] dims, @ByVal TfLiteQuantization quantization, @Cast("const char*") BytePointer buffer,
        @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const int[] dims, @ByVal TfLiteQuantization quantization, @Cast("const char*") BytePointer buffer,
        @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const IntPointer dims, @ByVal TfLiteQuantization quantization, String buffer,
        @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const IntPointer dims, @ByVal TfLiteQuantization quantization, String buffer,
        @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const IntBuffer dims, @ByVal TfLiteQuantization quantization, @Cast("const char*") BytePointer buffer,
        @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const IntBuffer dims, @ByVal TfLiteQuantization quantization, @Cast("const char*") BytePointer buffer,
        @Cast("size_t") long bytes);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const int[] dims, @ByVal TfLiteQuantization quantization, String buffer,
        @Cast("size_t") long bytes, @Const Allocation allocation/*=nullptr*/,
        TfLiteSparsity sparsity/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadOnly(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const int[] dims, @ByVal TfLiteQuantization quantization, String buffer,
        @Cast("size_t") long bytes);

  // Set description of inputs/outputs/data/fptrs for node `node_index`.
  // This variant assumes an external buffer has been allocated of size
  // bytes. The lifetime of buffer must be ensured to be greater or equal
  // to Interpreter. `quantization` ownership is passed to the subgraph.
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector IntPointer dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @StdVector IntPointer dims_signature/*={}*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector IntPointer dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector IntBuffer dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @StdVector IntBuffer dims_signature/*={}*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector IntBuffer dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector int[] dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @StdVector int[] dims_signature/*={}*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector int[] dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector IntPointer dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @StdVector IntPointer dims_signature/*={}*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector IntPointer dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector IntBuffer dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @StdVector IntBuffer dims_signature/*={}*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name,
        @StdVector IntBuffer dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector int[] dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @StdVector int[] dims_signature/*={}*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name,
        @StdVector int[] dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const IntPointer dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @Cast("const size_t") long rank_dims_signature/*=0*/,
        @Const IntPointer dims_signature/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const IntPointer dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const IntBuffer dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @Cast("const size_t") long rank_dims_signature/*=0*/,
        @Const IntBuffer dims_signature/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const IntBuffer dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const int[] dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @Cast("const size_t") long rank_dims_signature/*=0*/,
        @Const int[] dims_signature/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const int[] dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const IntPointer dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @Cast("const size_t") long rank_dims_signature/*=0*/,
        @Const IntPointer dims_signature/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const IntPointer dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const IntBuffer dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @Cast("const size_t") long rank_dims_signature/*=0*/,
        @Const IntBuffer dims_signature/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, @Cast("const char*") BytePointer name, @Cast("const size_t") long rank,
        @Const IntBuffer dims, @ByVal TfLiteQuantization quantization);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const int[] dims, @ByVal TfLiteQuantization quantization,
        @Cast("bool") boolean is_variable/*=false*/, @Cast("const size_t") long rank_dims_signature/*=0*/,
        @Const int[] dims_signature/*=nullptr*/);
  public native @Cast("TfLiteStatus") int SetTensorParametersReadWrite(
        int tensor_index, @Cast("TfLiteType") int type, String name, @Cast("const size_t") long rank,
        @Const int[] dims, @ByVal TfLiteQuantization quantization);

  // Get a mutable tensor data structure.
  public native TfLiteTensor tensor(int tensor_index);

  // Get an immutable tensor data structure.

  // Read only access to list of inputs.
  public native @StdVector IntPointer inputs();

  // Read only access to list of inputs.

  // Read only access to list of outputs.
  public native @StdVector IntPointer outputs();

  // Read only access to list of outputs.

  // Read only access to list of variable tensors.
  public native @StdVector IntPointer variables();

  // Read only access to list of variable tensors.

  // WARNING: Experimental interface, subject to change.
  // TODO(ycling): Move this function to an external context interface.
  public native @Cast("tflite::resource::ResourceMap*") @ByRef IntResourceBaseMap resources();

  // WARNING: Experimental interface, subject to change.
  // TODO(b/149099381): Move this function to an external context interface.
  public native @Cast("tflite::resource::ResourceIDMap*") @ByRef StringIntMap resource_ids();

  // WARNING: Experimental interface, subject to change.
  // TODO(b/149099381): Move this function to an external context interface.
  public native @Cast("tflite::resource::InitializationStatusMap*") @ByRef IntResourceBaseMap initialization_status_map();

  public native @Cast("size_t") long tensors_size();

  // Return the number of ops in the model.
  public native @Cast("size_t") long nodes_size();

  // Return vector of node indices in the order of execution.
  public native @StdVector IntPointer execution_plan();

  // Return read-only vector of node indices in the order of execution.

  public native @StdMove RegistrationNodePairVector nodes_and_registration();

  // Get a pointer to an operation and registration data structure if in bounds.
  public native @Const RegistrationNodePair node_and_registration(
        int node_index);

  // Change the dimensionality of a given tensor. Note, this is only acceptable
  // for tensor indices that are inputs.
  // Returns status of failure or success.
  public native @Cast("TfLiteStatus") int ResizeInputTensor(int tensor_index,
                                   @StdVector IntPointer dims);
  public native @Cast("TfLiteStatus") int ResizeInputTensor(int tensor_index,
                                   @StdVector IntBuffer dims);
  public native @Cast("TfLiteStatus") int ResizeInputTensor(int tensor_index,
                                   @StdVector int[] dims);

  // WARNING: Experimental interface, subject to change
  // Change the dimensionality of a given tensor. This is only acceptable for
  // tensor indices that are inputs or variables. Only unknown dimensions can be
  // resized with this function. Unknown dimensions are indicated as `-1` in the
  // `dims_signature` attribute of a `TfLiteTensor`. Returns status of failure
  // or success.
  public native @Cast("TfLiteStatus") int ResizeInputTensorStrict(int tensor_index,
                                         @StdVector IntPointer dims);
  public native @Cast("TfLiteStatus") int ResizeInputTensorStrict(int tensor_index,
                                         @StdVector IntBuffer dims);
  public native @Cast("TfLiteStatus") int ResizeInputTensorStrict(int tensor_index,
                                         @StdVector int[] dims);

  // This releases memory held by non-persistent tensors. It does NOT re-perform
  // memory planning.
  // AllocateTensors needs to be called before next invocation.
  public native @Cast("TfLiteStatus") int ReleaseNonPersistentMemory();

  // Update allocations for all tensors. This will redim dependent tensors using
  // the input tensor dimensionality as given. This is relatively expensive.
  // If you know that your sizes are not changing, you need not call this.
  // Returns status of success or failure.
  public native @Cast("TfLiteStatus") int AllocateTensors();

  // Invoke the subgraph (run the whole graph in dependency order).
  //
  // NOTE: It is possible that the interpreter is not in a ready state
  // to evaluate (i.e. if a ResizeTensor() has been performed without an
  // AllocateTensors().
  // Returns status of success or failure.
  public native @Cast("TfLiteStatus") int Invoke();

  // Entry point for C node plugin API to report an error.
  public native void ReportError(@Cast("const char*") BytePointer format);
  public native void ReportError(String format);

  // Return the subgraph specific context.
  public native TfLiteContext context();

  // Set the value of an external context.
  public native void SetExternalContext(@Cast("TfLiteExternalContextType") int type,
                            TfLiteExternalContext ctx);
  // Get the half precision flag.
  // WARNING: This is an experimental API and subject to change.
  public native @Cast("bool") boolean GetAllowFp16PrecisionForFp32();

  // Sets the cancellation function pointer in order to cancel a request in the
  // middle of a call to Invoke(). The interpreter queries this function during
  // inference, between op invocations; when it returns true, the interpreter
  // will abort execution and return `kTfLiteError`. The `data` parameter
  // contains any data used by the cancellation function, and if non-null,
  // remains owned by the caller.
  // WARNING: This is an experimental API and subject to change.
  public static class Check_cancelled_func_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Check_cancelled_func_Pointer(Pointer p) { super(p); }
      protected Check_cancelled_func_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("bool") boolean call(Pointer arg0);
  }
  public native void SetCancellationFunction(Pointer data, Check_cancelled_func_Pointer check_cancelled_func);

  // Ensure the data in `tensor.data` is readable. In case delegate is used,
  // it might require to copy the data from delegate buffer to raw memory.
  // WARNING: This is an experimental API and subject to change.
  public native @Cast("TfLiteStatus") int EnsureTensorDataIsReadable(int tensor_index);

  // The default capacity of `tensors_` vector.
  @MemberGetter public static native int kTensorsReservedCapacity();
  public static final int kTensorsReservedCapacity = kTensorsReservedCapacity();
  // The capacity headroom of `tensors_` vector before calling ops'
  // `prepare` and `invoke` function. In these functions, it's guaranteed
  // allocating up to `kTensorsCapacityHeadroom` more tensors won't invalidate
  // pointers to existing tensors.
  @MemberGetter public static native int kTensorsCapacityHeadroom();
  public static final int kTensorsCapacityHeadroom = kTensorsCapacityHeadroom();

  // Reset all variable tensors to the default value.
  // If a variable tensor doesn't have a buffer, reset it to zero.
  // TODO(b/115961645): Implement - If a variable tensor has a buffer, reset it
  // to the value of the buffer.
  // WARNING: This is an experimental API and subject to change.
  public native @Cast("TfLiteStatus") int ResetVariableTensors();

  public native void SetProfiler(Profiler profiler, int associated_subgraph_idx);

  public native Profiler GetProfiler();

  // Returns a pointer to vector of subgraphs.
  // WARNING: This is an experimental API and subject to change.
  public native SubgraphVector GetSubgraphs();

  // True if all tensors in the graph has static size after calling
  // `AllocateTensors` function.
  // Before `AllocateTensors` is called, this will always return true;
  public native @Cast("bool") boolean HasDynamicTensors();

  // Assigns (or reassigns) a custom memory allocation for the given tensor.
  // `flags` is a bitmask, see TfLiteCustomAllocationFlags.
  // The runtime does NOT take ownership of the underlying memory.
  //
  // NOTE: User needs to call AllocateTensors() after this.
  // Invalid/insufficient buffers will cause an error during AllocateTensors or
  // Invoke (in case of dynamic shapes in the graph).
  //
  // Parameters should satisfy the following conditions:
  // 1. tensor->allocation_type == kTfLiteArenaRw or kTfLiteArenaRwPersistent
  //    In general, this is true for I/O tensors & variable tensors.
  // 2. allocation->data has the appropriate permissions for runtime access
  //    (Read-only for inputs, Read-Write for others), and outlives Interpreter.
  // 3. allocation->bytes >= tensor->bytes.
  //    This condition is checked again if any tensors are resized.
  // 4. allocation->data should be aligned to kDefaultTensorAlignment
  //    defined in lite/util.h. (Currently 64 bytes)
  //    This check is skipped if kTfLiteCustomAllocationFlagsSkipAlignCheck is
  //    set through `flags`.
  // TODO(b/182215910): Expand on this documentation in a g3doc.
  //
  // WARNING: This is an experimental interface that is subject to change.
  public native @Cast("TfLiteStatus") int SetCustomAllocationForTensor(
        int tensor_index, @Const @ByRef TfLiteCustomAllocation allocation,
        @Cast("int64_t") long flags/*=kTfLiteCustomAllocationFlagsNone*/);
  public native @Cast("TfLiteStatus") int SetCustomAllocationForTensor(
        int tensor_index, @Const @ByRef TfLiteCustomAllocation allocation);

  public native void SetName(@Cast("const char*") BytePointer name);
  public native void SetName(String name);
  public native @StdString String GetName();

  // WARNING: This is an experimental API and subject to change.
  // Dumps debugging info by the underlying memory planner.
  // Note: to have minimal binary increase caused by this debug info dump for
  // the TfLite library and allow users to plug-in their own memory planner
  // debugger, we have utilized weak symbols to meet these two requirements. By
  // default, there is no debugging info dumped. However, if the TfLite-provided
  // lite:simple_memory_arena_debug_dump (i.e. containing the strong defintion)
  // is linked to the program, calling this function will output memory usage
  // information about tenosrs and ops.
  public native void DumpMemoryPlannerDebugInfo();

  // WARNING: This is an experimental API and subject to change.
  // Force all intermediate dynamic tensors to be released once they are not
  // used by the model. Please use this configuration with caution, since it
  // might reduce the peak memory usage of the model at the cost of a slower
  // inference speed. This API needs to be called before calling
  // `AllocateTensors`.
  public native void EnsureDynamicTensorsAreReleased();

  /** WARNING: This is an experimental API and subject to change.
   *  Use dynamic tensor allocation method for large intermediate tensors
   *  instead of static memory planner. It improves peak memory usage but there
   *  could be some latency impact. The parameter
   *  {@code large_tensors_threshods_in_bytes} is used to determine large tensors.
   *  This API must be called before {@code AllocateTensors}. */
  public native void UseDynamicAllocationForLargeTensors(
        int large_tensors_threshods_in_bytes);

  // WARNING: This is an experimental API and subject to change.
  // Remove unused inputs of the subgraph. It checks usage of inputs and mark it
  // as kTfLiteOptionalTensor if the input is not used in graph execution.
  // Currently, it's used to remove unused inputs of WHILE cond subgraphs.
  public native @Cast("TfLiteStatus") int RemoveUnusedInputs();
}
