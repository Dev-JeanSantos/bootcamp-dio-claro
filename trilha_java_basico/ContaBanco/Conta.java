public class Conta {

    private int numeroDaConta;
    private String numeroDaAgencia;
    private String nomeCliente;
    private double saldo;

    public Conta(int numeroDaConta, String numeroDaAgencia, String nomeCliente, double saldo) {
        
        if (!validarNumeroDaAgencia(numeroDaAgencia)) {
            throw new IllegalArgumentException("Número da agência inválido");
        }

        if (!validarNumeroDaConta(numeroDaConta)) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
     
        if (!validarNomeCliente(nomeCliente)) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }

        if (!validarSaldo(saldo)) {
            throw new IllegalArgumentException("Saldo inválido");
        }

        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Conta() {
        this(0, "000-0", "Nome Padrão", 0.0);
    }

    private boolean validarNumeroDaConta(int numeroDaConta) {
        return numeroDaConta >= 0;
    }

    private boolean validarNumeroDaAgencia(String numeroDaAgencia) {
        return numeroDaAgencia != null && numeroDaAgencia.matches("\\d{3}-\\d");
    }

    private boolean validarNomeCliente(String nomeCliente) {
        return nomeCliente != null && !nomeCliente.trim().isEmpty();
    }

    private boolean validarSaldo(double saldo) {
        return saldo >= 0.0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        if (!validarNumeroDaConta(numeroDaConta)) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        this.numeroDaConta = numeroDaConta;
    }

    public String getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(String numeroDaAgencia) {
        if (!validarNumeroDaAgencia(numeroDaAgencia)) {
            throw new IllegalArgumentException("Número da agência inválido");
        }
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (!validarNomeCliente(nomeCliente)) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (!validarSaldo(saldo)) {
            throw new IllegalArgumentException("Saldo inválido");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroDaConta=" + numeroDaConta +
                ", numeroDaAgencia='" + numeroDaAgencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
