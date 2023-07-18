package com.itheima.search;

class Block2 {
    private int max;
    private int min;
    private int start;
    private int end;

    public Block2() {
    }

    public Block2(int max, int start, int end) {
        this.max = max;
        this.start = start;
        this.end = end;
    }

    public Block2(int max, int min, int start, int end) {
        this.max = max;
        this.min = min;
        this.start = start;
        this.end = end;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return start
     */
    public int getStart() {
        return start;
    }

    /**
     * 设置
     *
     * @param start
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * 获取
     *
     * @return end
     */
    public int getEnd() {
        return end;
    }

    /**
     * 设置
     *
     * @param end
     */
    public void setEnd(int end) {
        this.end = end;
    }

    public String toString() {
        return "Block{max = " + max + ", start = " + start + ", end = " + end + "}";
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }
}