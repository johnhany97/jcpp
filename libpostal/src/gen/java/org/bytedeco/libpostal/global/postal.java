// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.libpostal.global;

import org.bytedeco.libpostal.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class postal extends org.bytedeco.libpostal.presets.postal {
    static { Loader.load(); }

// Parsed from libpostal/libpostal.h

// #ifndef LIBPOSTAL_H
// #define LIBPOSTAL_H

// #ifdef __cplusplus
// #endif

// #include <stdio.h>
// #include <stdlib.h>
// #include <stdint.h>
// #include <stdbool.h>

// #ifdef _WIN32
// #ifdef LIBPOSTAL_EXPORTS
// #define LIBPOSTAL_EXPORT __declspec(dllexport)
// #else
// #define LIBPOSTAL_EXPORT __declspec(dllimport)
// #endif
// #elif __GNUC__ >= 4
// #define LIBPOSTAL_EXPORT __attribute__ ((visibility("default")))
// #else
// #define LIBPOSTAL_EXPORT
// #endif

public static final int LIBPOSTAL_MAX_LANGUAGE_LEN = 4;

// Doing these as #defines so we can duplicate the values exactly in Python


/** enum libpostal_token_type_t */
public static final int
    LIBPOSTAL_TOKEN_TYPE_END = 0,                   // Null byte
    // Word types
    LIBPOSTAL_TOKEN_TYPE_WORD = 1,                  // Any letter-only word (includes all unicode letters)
    LIBPOSTAL_TOKEN_TYPE_ABBREVIATION = 2,          // Loose abbreviations (roughly anything containing a "." as we don't care about sentences in addresses)
    LIBPOSTAL_TOKEN_TYPE_IDEOGRAPHIC_CHAR = 3,      // For languages that don't separate on whitespace (e.g. Chinese, Japanese, Korean), separate by character
    LIBPOSTAL_TOKEN_TYPE_HANGUL_SYLLABLE = 4,       // Hangul syllable sequences which contain more than one codepoint
    LIBPOSTAL_TOKEN_TYPE_ACRONYM = 5,               // Specifically things like U.N. where we may delete internal periods

    LIBPOSTAL_TOKEN_TYPE_PHRASE = 10,               // Not part of the first stage tokenizer, but may be used after phrase parsing

    // Special tokens
    LIBPOSTAL_TOKEN_TYPE_EMAIL = 20,                // Make sure emails are tokenized altogether
    LIBPOSTAL_TOKEN_TYPE_URL = 21,                  // Make sure urls are tokenized altogether
    LIBPOSTAL_TOKEN_TYPE_US_PHONE = 22,             // US phone number (with or without country code)
    LIBPOSTAL_TOKEN_TYPE_INTL_PHONE = 23,           // A non-US phone number (must have country code)

    // Numbers and numeric types
    LIBPOSTAL_TOKEN_TYPE_NUMERIC = 50,              // Any sequence containing a digit
    LIBPOSTAL_TOKEN_TYPE_ORDINAL = 51,              // 1st, 2nd, 1er, 1 etc.
    LIBPOSTAL_TOKEN_TYPE_ROMAN_NUMERAL = 52,        // II, III, VI, etc.
    LIBPOSTAL_TOKEN_TYPE_IDEOGRAPHIC_NUMBER = 53,   // All numeric ideographic characters, includes e.g. Han numbers and chars like "²"

    // Punctuation types, may separate a phrase
    LIBPOSTAL_TOKEN_TYPE_PERIOD = 100,
    LIBPOSTAL_TOKEN_TYPE_EXCLAMATION = 101,
    LIBPOSTAL_TOKEN_TYPE_QUESTION_MARK = 102,
    LIBPOSTAL_TOKEN_TYPE_COMMA = 103,
    LIBPOSTAL_TOKEN_TYPE_COLON = 104,
    LIBPOSTAL_TOKEN_TYPE_SEMICOLON = 105,
    LIBPOSTAL_TOKEN_TYPE_PLUS = 106,
    LIBPOSTAL_TOKEN_TYPE_AMPERSAND = 107,
    LIBPOSTAL_TOKEN_TYPE_AT_SIGN = 108,
    LIBPOSTAL_TOKEN_TYPE_POUND = 109,
    LIBPOSTAL_TOKEN_TYPE_ELLIPSIS = 110,
    LIBPOSTAL_TOKEN_TYPE_DASH = 111,
    LIBPOSTAL_TOKEN_TYPE_BREAKING_DASH = 112,
    LIBPOSTAL_TOKEN_TYPE_HYPHEN = 113,
    LIBPOSTAL_TOKEN_TYPE_PUNCT_OPEN = 114,
    LIBPOSTAL_TOKEN_TYPE_PUNCT_CLOSE = 115,
    LIBPOSTAL_TOKEN_TYPE_DOUBLE_QUOTE = 119,
    LIBPOSTAL_TOKEN_TYPE_SINGLE_QUOTE = 120,
    LIBPOSTAL_TOKEN_TYPE_OPEN_QUOTE = 121,
    LIBPOSTAL_TOKEN_TYPE_CLOSE_QUOTE = 122,
    LIBPOSTAL_TOKEN_TYPE_SLASH = 124,
    LIBPOSTAL_TOKEN_TYPE_BACKSLASH = 125,
    LIBPOSTAL_TOKEN_TYPE_GREATER_THAN = 126,
    LIBPOSTAL_TOKEN_TYPE_LESS_THAN = 127,

    // Non-letters and whitespace
    LIBPOSTAL_TOKEN_TYPE_OTHER = 200,
    LIBPOSTAL_TOKEN_TYPE_WHITESPACE = 300,
    LIBPOSTAL_TOKEN_TYPE_NEWLINE = 301,

    LIBPOSTAL_TOKEN_TYPE_INVALID_CHAR = 500;


/* 
Address dictionaries
*/
// Bit set, should be able to keep it at a short (uint16_t)
public static final int LIBPOSTAL_ADDRESS_NONE = 0;
public static final int LIBPOSTAL_ADDRESS_ANY = (1 << 0);
public static final int LIBPOSTAL_ADDRESS_NAME = (1 << 1);
public static final int LIBPOSTAL_ADDRESS_HOUSE_NUMBER = (1 << 2);
public static final int LIBPOSTAL_ADDRESS_STREET = (1 << 3);
public static final int LIBPOSTAL_ADDRESS_UNIT = (1 << 4);
public static final int LIBPOSTAL_ADDRESS_LEVEL = (1 << 5);
public static final int LIBPOSTAL_ADDRESS_STAIRCASE = (1 << 6);
public static final int LIBPOSTAL_ADDRESS_ENTRANCE = (1 << 7);

public static final int LIBPOSTAL_ADDRESS_CATEGORY = (1 << 8);
public static final int LIBPOSTAL_ADDRESS_NEAR = (1 << 9);

public static final int LIBPOSTAL_ADDRESS_TOPONYM = (1 << 13);
public static final int LIBPOSTAL_ADDRESS_POSTAL_CODE = (1 << 14);
public static final int LIBPOSTAL_ADDRESS_PO_BOX = (1 << 15);
public static final int LIBPOSTAL_ADDRESS_ALL = ((1 << 16) - 1);
// Targeting ../libpostal_normalize_options_t.java



@NoException public static native @ByVal libpostal_normalize_options_t libpostal_get_default_options();

@NoException public static native @Cast("char**") PointerPointer libpostal_expand_address(@Cast("char*") BytePointer input, @ByVal libpostal_normalize_options_t options, @Cast("size_t*") SizeTPointer n);
@NoException public static native @Cast("char**") @ByPtrPtr String libpostal_expand_address(@Cast("char*") String input, @ByVal libpostal_normalize_options_t options, @Cast("size_t*") SizeTPointer n);
@NoException public static native @Cast("char**") PointerPointer libpostal_expand_address_root(@Cast("char*") BytePointer input, @ByVal libpostal_normalize_options_t options, @Cast("size_t*") SizeTPointer n);
@NoException public static native @Cast("char**") @ByPtrPtr String libpostal_expand_address_root(@Cast("char*") String input, @ByVal libpostal_normalize_options_t options, @Cast("size_t*") SizeTPointer n);

@NoException public static native void libpostal_expansion_array_destroy(@Cast("char**") PointerPointer expansions, @Cast("size_t") long n);
@NoException public static native void libpostal_expansion_array_destroy(@Cast("char**") @ByPtrPtr BytePointer expansions, @Cast("size_t") long n);
@NoException public static native void libpostal_expansion_array_destroy(@Cast("char**") @ByPtrPtr String expansions, @Cast("size_t") long n);
// Targeting ../libpostal_address_parser_response_t.java


// Targeting ../libpostal_address_parser_options_t.java



@NoException public static native void libpostal_address_parser_response_destroy(libpostal_address_parser_response_t self);

@NoException public static native @ByVal libpostal_address_parser_options_t libpostal_get_address_parser_default_options();

@NoException public static native libpostal_address_parser_response_t libpostal_parse_address(@Cast("char*") BytePointer address, @ByVal libpostal_address_parser_options_t options);
@NoException public static native libpostal_address_parser_response_t libpostal_parse_address(@Cast("char*") String address, @ByVal libpostal_address_parser_options_t options);

@NoException public static native @Cast("bool") boolean libpostal_parser_print_features(@Cast("bool") boolean print_features);
// Targeting ../libpostal_near_dupe_hash_options_t.java




@NoException public static native @ByVal libpostal_near_dupe_hash_options_t libpostal_get_near_dupe_hash_default_options();
@NoException public static native @Cast("char**") PointerPointer libpostal_near_dupe_hashes(@Cast("size_t") long num_components, @Cast("char**") PointerPointer labels, @Cast("char**") PointerPointer values, @ByVal libpostal_near_dupe_hash_options_t options, @Cast("size_t*") SizeTPointer num_hashes);
@NoException public static native @Cast("char**") @ByPtrPtr BytePointer libpostal_near_dupe_hashes(@Cast("size_t") long num_components, @Cast("char**") @ByPtrPtr BytePointer labels, @Cast("char**") @ByPtrPtr BytePointer values, @ByVal libpostal_near_dupe_hash_options_t options, @Cast("size_t*") SizeTPointer num_hashes);
@NoException public static native @Cast("char**") @ByPtrPtr String libpostal_near_dupe_hashes(@Cast("size_t") long num_components, @Cast("char**") @ByPtrPtr String labels, @Cast("char**") @ByPtrPtr String values, @ByVal libpostal_near_dupe_hash_options_t options, @Cast("size_t*") SizeTPointer num_hashes);
@NoException public static native @Cast("char**") PointerPointer libpostal_near_dupe_hashes_languages(@Cast("size_t") long num_components, @Cast("char**") PointerPointer labels, @Cast("char**") PointerPointer values, @ByVal libpostal_near_dupe_hash_options_t options, @Cast("size_t") long num_languages, @Cast("char**") PointerPointer languages, @Cast("size_t*") SizeTPointer num_hashes);
@NoException public static native @Cast("char**") @ByPtrPtr BytePointer libpostal_near_dupe_hashes_languages(@Cast("size_t") long num_components, @Cast("char**") @ByPtrPtr BytePointer labels, @Cast("char**") @ByPtrPtr BytePointer values, @ByVal libpostal_near_dupe_hash_options_t options, @Cast("size_t") long num_languages, @Cast("char**") @ByPtrPtr BytePointer languages, @Cast("size_t*") SizeTPointer num_hashes);
@NoException public static native @Cast("char**") @ByPtrPtr String libpostal_near_dupe_hashes_languages(@Cast("size_t") long num_components, @Cast("char**") @ByPtrPtr String labels, @Cast("char**") @ByPtrPtr String values, @ByVal libpostal_near_dupe_hash_options_t options, @Cast("size_t") long num_languages, @Cast("char**") @ByPtrPtr String languages, @Cast("size_t*") SizeTPointer num_hashes);

// Dupe language classification

@NoException public static native @Cast("char**") PointerPointer libpostal_place_languages(@Cast("size_t") long num_components, @Cast("char**") PointerPointer labels, @Cast("char**") PointerPointer values, @Cast("size_t*") SizeTPointer num_languages);
@NoException public static native @Cast("char**") @ByPtrPtr BytePointer libpostal_place_languages(@Cast("size_t") long num_components, @Cast("char**") @ByPtrPtr BytePointer labels, @Cast("char**") @ByPtrPtr BytePointer values, @Cast("size_t*") SizeTPointer num_languages);
@NoException public static native @Cast("char**") @ByPtrPtr String libpostal_place_languages(@Cast("size_t") long num_components, @Cast("char**") @ByPtrPtr String labels, @Cast("char**") @ByPtrPtr String values, @Cast("size_t*") SizeTPointer num_languages);

// Pairwise dupe methods

/** enum libpostal_duplicate_status_t */
public static final int
    LIBPOSTAL_NULL_DUPLICATE_STATUS = -1,
    LIBPOSTAL_NON_DUPLICATE = 0,
    LIBPOSTAL_POSSIBLE_DUPLICATE_NEEDS_REVIEW = 3,
    LIBPOSTAL_LIKELY_DUPLICATE = 6,
    LIBPOSTAL_EXACT_DUPLICATE = 9;
// Targeting ../libpostal_duplicate_options_t.java




@NoException public static native @ByVal libpostal_duplicate_options_t libpostal_get_default_duplicate_options();
@NoException public static native @ByVal libpostal_duplicate_options_t libpostal_get_duplicate_options_with_languages(@Cast("size_t") long num_languages, @Cast("char**") PointerPointer languages);
@NoException public static native @ByVal libpostal_duplicate_options_t libpostal_get_duplicate_options_with_languages(@Cast("size_t") long num_languages, @Cast("char**") @ByPtrPtr BytePointer languages);
@NoException public static native @ByVal libpostal_duplicate_options_t libpostal_get_duplicate_options_with_languages(@Cast("size_t") long num_languages, @Cast("char**") @ByPtrPtr String languages);

@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_name_duplicate(@Cast("char*") BytePointer value1, @Cast("char*") BytePointer value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_name_duplicate(@Cast("char*") String value1, @Cast("char*") String value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_street_duplicate(@Cast("char*") BytePointer value1, @Cast("char*") BytePointer value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_street_duplicate(@Cast("char*") String value1, @Cast("char*") String value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_house_number_duplicate(@Cast("char*") BytePointer value1, @Cast("char*") BytePointer value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_house_number_duplicate(@Cast("char*") String value1, @Cast("char*") String value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_po_box_duplicate(@Cast("char*") BytePointer value1, @Cast("char*") BytePointer value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_po_box_duplicate(@Cast("char*") String value1, @Cast("char*") String value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_unit_duplicate(@Cast("char*") BytePointer value1, @Cast("char*") BytePointer value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_unit_duplicate(@Cast("char*") String value1, @Cast("char*") String value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_floor_duplicate(@Cast("char*") BytePointer value1, @Cast("char*") BytePointer value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_floor_duplicate(@Cast("char*") String value1, @Cast("char*") String value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_postal_code_duplicate(@Cast("char*") BytePointer value1, @Cast("char*") BytePointer value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_postal_code_duplicate(@Cast("char*") String value1, @Cast("char*") String value2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_toponym_duplicate(@Cast("size_t") long num_components1, @Cast("char**") PointerPointer labels1, @Cast("char**") PointerPointer values1, @Cast("size_t") long num_components2, @Cast("char**") PointerPointer labels2, @Cast("char**") PointerPointer values2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_toponym_duplicate(@Cast("size_t") long num_components1, @Cast("char**") @ByPtrPtr BytePointer labels1, @Cast("char**") @ByPtrPtr BytePointer values1, @Cast("size_t") long num_components2, @Cast("char**") @ByPtrPtr BytePointer labels2, @Cast("char**") @ByPtrPtr BytePointer values2, @ByVal libpostal_duplicate_options_t options);
@NoException public static native @Cast("libpostal_duplicate_status_t") int libpostal_is_toponym_duplicate(@Cast("size_t") long num_components1, @Cast("char**") @ByPtrPtr String labels1, @Cast("char**") @ByPtrPtr String values1, @Cast("size_t") long num_components2, @Cast("char**") @ByPtrPtr String labels2, @Cast("char**") @ByPtrPtr String values2, @ByVal libpostal_duplicate_options_t options);
// Targeting ../libpostal_fuzzy_duplicate_options_t.java


// Targeting ../libpostal_fuzzy_duplicate_status_t.java



@NoException public static native @ByVal libpostal_fuzzy_duplicate_options_t libpostal_get_default_fuzzy_duplicate_options();
@NoException public static native @ByVal libpostal_fuzzy_duplicate_options_t libpostal_get_default_fuzzy_duplicate_options_with_languages(@Cast("size_t") long num_languages, @Cast("char**") PointerPointer languages);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_options_t libpostal_get_default_fuzzy_duplicate_options_with_languages(@Cast("size_t") long num_languages, @Cast("char**") @ByPtrPtr BytePointer languages);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_options_t libpostal_get_default_fuzzy_duplicate_options_with_languages(@Cast("size_t") long num_languages, @Cast("char**") @ByPtrPtr String languages);

@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_name_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") PointerPointer tokens1, DoublePointer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") PointerPointer tokens2, DoublePointer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_name_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr BytePointer tokens1, DoublePointer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr BytePointer tokens2, DoublePointer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_name_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr String tokens1, DoubleBuffer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr String tokens2, DoubleBuffer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_name_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr BytePointer tokens1, double[] token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr BytePointer tokens2, double[] token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_name_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr String tokens1, DoublePointer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr String tokens2, DoublePointer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_name_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr BytePointer tokens1, DoubleBuffer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr BytePointer tokens2, DoubleBuffer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_name_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr String tokens1, double[] token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr String tokens2, double[] token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_street_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") PointerPointer tokens1, DoublePointer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") PointerPointer tokens2, DoublePointer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_street_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr BytePointer tokens1, DoublePointer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr BytePointer tokens2, DoublePointer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_street_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr String tokens1, DoubleBuffer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr String tokens2, DoubleBuffer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_street_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr BytePointer tokens1, double[] token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr BytePointer tokens2, double[] token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_street_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr String tokens1, DoublePointer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr String tokens2, DoublePointer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_street_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr BytePointer tokens1, DoubleBuffer token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr BytePointer tokens2, DoubleBuffer token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);
@NoException public static native @ByVal libpostal_fuzzy_duplicate_status_t libpostal_is_street_duplicate_fuzzy(@Cast("size_t") long num_tokens1, @Cast("char**") @ByPtrPtr String tokens1, double[] token_scores1, @Cast("size_t") long num_tokens2, @Cast("char**") @ByPtrPtr String tokens2, double[] token_scores2, @ByVal libpostal_fuzzy_duplicate_options_t options);

// Setup/teardown methods

@NoException public static native @Cast("bool") boolean libpostal_setup();
@NoException public static native @Cast("bool") boolean libpostal_setup_datadir(@Cast("char*") BytePointer datadir);
@NoException public static native @Cast("bool") boolean libpostal_setup_datadir(@Cast("char*") String datadir);
@NoException public static native void libpostal_teardown();

@NoException public static native @Cast("bool") boolean libpostal_setup_parser();
@NoException public static native @Cast("bool") boolean libpostal_setup_parser_datadir(@Cast("char*") BytePointer datadir);
@NoException public static native @Cast("bool") boolean libpostal_setup_parser_datadir(@Cast("char*") String datadir);
@NoException public static native void libpostal_teardown_parser();

@NoException public static native @Cast("bool") boolean libpostal_setup_language_classifier();
@NoException public static native @Cast("bool") boolean libpostal_setup_language_classifier_datadir(@Cast("char*") BytePointer datadir);
@NoException public static native @Cast("bool") boolean libpostal_setup_language_classifier_datadir(@Cast("char*") String datadir);
@NoException public static native void libpostal_teardown_language_classifier();
// Targeting ../libpostal_token_t.java



@NoException public static native libpostal_token_t libpostal_tokenize(@Cast("char*") BytePointer input, @Cast("bool") boolean whitespace, @Cast("size_t*") SizeTPointer n);
@NoException public static native libpostal_token_t libpostal_tokenize(@Cast("char*") String input, @Cast("bool") boolean whitespace, @Cast("size_t*") SizeTPointer n);

// Normalize string options
public static final int LIBPOSTAL_NORMALIZE_STRING_LATIN_ASCII = 1 << 0;
public static final int LIBPOSTAL_NORMALIZE_STRING_TRANSLITERATE = 1 << 1;
public static final int LIBPOSTAL_NORMALIZE_STRING_STRIP_ACCENTS = 1 << 2;
public static final int LIBPOSTAL_NORMALIZE_STRING_DECOMPOSE = 1 << 3;
public static final int LIBPOSTAL_NORMALIZE_STRING_LOWERCASE = 1 << 4;
public static final int LIBPOSTAL_NORMALIZE_STRING_TRIM = 1 << 5;
public static final int LIBPOSTAL_NORMALIZE_STRING_REPLACE_HYPHENS = 1 << 6;
public static final int LIBPOSTAL_NORMALIZE_STRING_COMPOSE = 1 << 7;
public static final int LIBPOSTAL_NORMALIZE_STRING_SIMPLE_LATIN_ASCII = 1 << 8;
public static final int LIBPOSTAL_NORMALIZE_STRING_REPLACE_NUMEX = 1 << 9;

// Normalize token options
public static final int LIBPOSTAL_NORMALIZE_TOKEN_REPLACE_HYPHENS = 1 << 0;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_DELETE_HYPHENS = 1 << 1;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_DELETE_FINAL_PERIOD = 1 << 2;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_DELETE_ACRONYM_PERIODS = 1 << 3;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_DROP_ENGLISH_POSSESSIVES = 1 << 4;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_DELETE_OTHER_APOSTROPHE = 1 << 5;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_SPLIT_ALPHA_FROM_NUMERIC = 1 << 6;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_REPLACE_DIGITS = 1 << 7;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_REPLACE_NUMERIC_TOKEN_LETTERS = 1 << 8;
public static final int LIBPOSTAL_NORMALIZE_TOKEN_REPLACE_NUMERIC_HYPHENS = 1 << 9;

public static final int LIBPOSTAL_NORMALIZE_DEFAULT_STRING_OPTIONS = (LIBPOSTAL_NORMALIZE_STRING_LATIN_ASCII | LIBPOSTAL_NORMALIZE_STRING_COMPOSE | LIBPOSTAL_NORMALIZE_STRING_TRIM | LIBPOSTAL_NORMALIZE_STRING_REPLACE_HYPHENS | LIBPOSTAL_NORMALIZE_STRING_STRIP_ACCENTS | LIBPOSTAL_NORMALIZE_STRING_LOWERCASE);

public static final int LIBPOSTAL_NORMALIZE_DEFAULT_TOKEN_OPTIONS = (LIBPOSTAL_NORMALIZE_TOKEN_REPLACE_HYPHENS | LIBPOSTAL_NORMALIZE_TOKEN_DELETE_FINAL_PERIOD | LIBPOSTAL_NORMALIZE_TOKEN_DELETE_ACRONYM_PERIODS | LIBPOSTAL_NORMALIZE_TOKEN_DROP_ENGLISH_POSSESSIVES | LIBPOSTAL_NORMALIZE_TOKEN_DELETE_OTHER_APOSTROPHE);

public static final int LIBPOSTAL_NORMALIZE_TOKEN_OPTIONS_DROP_PERIODS = (LIBPOSTAL_NORMALIZE_TOKEN_DELETE_FINAL_PERIOD | LIBPOSTAL_NORMALIZE_TOKEN_DELETE_ACRONYM_PERIODS);

public static final int LIBPOSTAL_NORMALIZE_DEFAULT_TOKEN_OPTIONS_NUMERIC = (LIBPOSTAL_NORMALIZE_DEFAULT_TOKEN_OPTIONS | LIBPOSTAL_NORMALIZE_TOKEN_SPLIT_ALPHA_FROM_NUMERIC);

@NoException public static native @Cast("char*") BytePointer libpostal_normalize_string(@Cast("char*") BytePointer input, @Cast("uint64_t") long options);
@NoException public static native @Cast("char*") String libpostal_normalize_string(@Cast("char*") String input, @Cast("uint64_t") long options);
// Targeting ../libpostal_normalized_token_t.java





// #ifdef __cplusplus
// #endif

// #endif


}
