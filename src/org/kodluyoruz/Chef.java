package org.kodluyoruz;

public class Chef extends Thread{

    private Order order;
    private String chef;

    public Chef(Order order, String chef) {
        this.order=order;
        this.chef=chef;
    }

    @Override
    public void run() {
        super.run();
    }
}
