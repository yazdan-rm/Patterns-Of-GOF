package com.abstractfactory;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

   Instance createInstance(Instance.Capacity capacity);

   Storage createStorage(Integer capMib);
}
