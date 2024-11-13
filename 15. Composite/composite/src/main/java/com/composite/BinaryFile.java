package com.composite;

//Leaf node in composite pattern
public class BinaryFile extends File {

    private final Long size;

    public BinaryFile(String name, Long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
