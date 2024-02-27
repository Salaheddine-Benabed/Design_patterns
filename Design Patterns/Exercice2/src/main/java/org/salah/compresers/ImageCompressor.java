package org.salah.compresers;

public abstract class ImageCompressor {

    public int[] compress(int[] data) {
        int[] compressedData = applyCompression(data);

        return compressedData;
    }

    protected abstract int[] applyCompression(int[] data);
}

