package RalucaG.ClassDesignOCAChapter5;

public class DoctorHouse {
  private String jobTitle = "Doctor";
  private String hospital = "Sf Constantin";

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  protected String getHospital() {
    return hospital;
  }

  protected void setHospital(String hospital) {
    this.hospital = hospital;
  }

  void does() {
    System.out.println(
        " Works to maintain, promote, and restore health by studying, diagnosing, and treating injuries and diseases.");
  }
}
