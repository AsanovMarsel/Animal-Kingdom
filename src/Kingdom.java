class Kingdom {
    private Eagle eagle;

    public Kingdom(Lion lion, Eagle eagle) {
        this.eagle = eagle;
    }

    public void enemyApproaching() {
        System.out.println(eagle.name + " замечает приближение врага!");
        System.out.println(eagle.name + " говарит льву о приближении врага!");
    }
}
