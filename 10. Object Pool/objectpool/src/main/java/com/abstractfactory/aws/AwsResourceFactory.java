package com.abstractfactory.aws;

import com.abstractfactory.Instance;
import com.abstractfactory.ResourceFactory;
import com.abstractfactory.Storage;


//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(Integer capMib) {
        return new S3Storage(capMib);
    }
}
