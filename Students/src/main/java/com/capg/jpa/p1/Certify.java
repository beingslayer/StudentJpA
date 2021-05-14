package com.capg.jpa.p1;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certify {
	@Column(name="Tech")
	private String certificateName;
	private String issuerName;
	
	public Certify() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	
	
	public Certify(String certificateName, String issuerName) {
		super();
		this.certificateName = certificateName;
		this.issuerName = issuerName;
		
	}
	
	@Override
	public String toString() {
		return "Certificates [certificateName=" + certificateName + ", issuerName=" + issuerName + "]";
	}
	
	
	
}