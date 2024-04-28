package core.jobOpening.domain;
public class JobRequirements {
    private String requirements;

    public JobRequirements(String requirements) {
        // Validação opcional pode ser realizada aqui
        this.requirements = requirements;
    }

    public String getRequirements() {
        return requirements;
    }

    // Outros métodos específicos, se necessário
}
