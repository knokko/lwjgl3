/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.libdivide;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct libdivide_u64_t {
 *     uint64_t magic;
 *     uint8_t more;
 * }</code></pre>
 */
@NativeType("struct libdivide_u64_t")
public class LibDivideU64 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAGIC,
        MORE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAGIC = layout.offsetof(0);
        MORE = layout.offsetof(1);
    }

    /**
     * Creates a {@code LibDivideU64} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LibDivideU64(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code magic} field. */
    @NativeType("uint64_t")
    public long magic() { return nmagic(address()); }
    /** @return the value of the {@code more} field. */
    @NativeType("uint8_t")
    public byte more() { return nmore(address()); }

    /** Sets the specified value to the {@code magic} field. */
    public LibDivideU64 magic(@NativeType("uint64_t") long value) { nmagic(address(), value); return this; }
    /** Sets the specified value to the {@code more} field. */
    public LibDivideU64 more(@NativeType("uint8_t") byte value) { nmore(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LibDivideU64 set(
        long magic,
        byte more
    ) {
        magic(magic);
        more(more);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LibDivideU64 set(LibDivideU64 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LibDivideU64} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LibDivideU64 malloc() {
        return wrap(LibDivideU64.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LibDivideU64} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LibDivideU64 calloc() {
        return wrap(LibDivideU64.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LibDivideU64} instance allocated with {@link BufferUtils}. */
    public static LibDivideU64 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LibDivideU64.class, memAddress(container), container);
    }

    /** Returns a new {@code LibDivideU64} instance for the specified memory address. */
    public static LibDivideU64 create(long address) {
        return wrap(LibDivideU64.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LibDivideU64 createSafe(long address) {
        return address == NULL ? null : wrap(LibDivideU64.class, address);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LibDivideU64.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LibDivideU64.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code LibDivideU64} instance allocated on the thread-local {@link MemoryStack}. */
    public static LibDivideU64 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code LibDivideU64} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static LibDivideU64 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code LibDivideU64} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LibDivideU64 mallocStack(MemoryStack stack) {
        return wrap(LibDivideU64.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LibDivideU64} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LibDivideU64 callocStack(MemoryStack stack) {
        return wrap(LibDivideU64.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #magic}. */
    public static long nmagic(long struct) { return UNSAFE.getLong(null, struct + LibDivideU64.MAGIC); }
    /** Unsafe version of {@link #more}. */
    public static byte nmore(long struct) { return UNSAFE.getByte(null, struct + LibDivideU64.MORE); }

    /** Unsafe version of {@link #magic(long) magic}. */
    public static void nmagic(long struct, long value) { UNSAFE.putLong(null, struct + LibDivideU64.MAGIC, value); }
    /** Unsafe version of {@link #more(byte) more}. */
    public static void nmore(long struct, byte value) { UNSAFE.putByte(null, struct + LibDivideU64.MORE, value); }

    // -----------------------------------

    /** An array of {@link LibDivideU64} structs. */
    public static class Buffer extends StructBuffer<LibDivideU64, Buffer> implements NativeResource {

        private static final LibDivideU64 ELEMENT_FACTORY = LibDivideU64.create(-1L);

        /**
         * Creates a new {@code LibDivideU64.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LibDivideU64#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected LibDivideU64 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code magic} field. */
        @NativeType("uint64_t")
        public long magic() { return LibDivideU64.nmagic(address()); }
        /** @return the value of the {@code more} field. */
        @NativeType("uint8_t")
        public byte more() { return LibDivideU64.nmore(address()); }

        /** Sets the specified value to the {@code magic} field. */
        public LibDivideU64.Buffer magic(@NativeType("uint64_t") long value) { LibDivideU64.nmagic(address(), value); return this; }
        /** Sets the specified value to the {@code more} field. */
        public LibDivideU64.Buffer more(@NativeType("uint8_t") byte value) { LibDivideU64.nmore(address(), value); return this; }

    }

}