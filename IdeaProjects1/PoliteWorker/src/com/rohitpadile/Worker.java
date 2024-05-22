package com.rohitpadile;

public class Worker {
    private String name;
    private Boolean active;

    public Worker(String name, Boolean active) {
        this.name = name;
        this.active = active;
    }
    public String getName() {
        return name;
    }

    public Boolean isActive() {
        return active;
    }

    public synchronized void work(SharedResource sharedResource, Worker otherWorker) {
        while(active){
            if(sharedResource.getOwner() != this) {
                try{
                    wait(10);
                }catch (InterruptedException e){

                }
                continue;
            }

            if(otherWorker.isActive()){
                System.out.println(getName() + ": give the resource to the worker " + otherWorker.getName());
                sharedResource.setOwner(otherWorker);
                continue;
            }
            System.out.println(getName() + ": working on the common resource ");
            active = false;
            sharedResource.setOwner(otherWorker);
        }
    }
}
