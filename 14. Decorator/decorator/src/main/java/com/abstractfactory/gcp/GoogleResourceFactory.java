package com.abstractfactory.gcp;


import com.abstractfactory.Instance;
import com.abstractfactory.ResourceFactory;
import com.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(Integer capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
