package com.openCl.guigui.HomeShop;

public interface Writer {
    /**
     * Start the Write process
     */
    public void start();

    /**
     * Write line
     * @param line
     */
    public void writeLine(String line);

    /**
     * Stop the Write process
     */
    public void stop();
}
