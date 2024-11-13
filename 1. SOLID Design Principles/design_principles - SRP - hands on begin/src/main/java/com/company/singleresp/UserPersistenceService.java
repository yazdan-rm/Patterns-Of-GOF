package com.company.singleresp;

public class UserPersistenceService {

    private final Store store = new Store();

	public void saveUser(User user) {
        store.store(user);
    }
}
