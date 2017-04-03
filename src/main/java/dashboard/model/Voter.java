package dashboard.model;

public class Voter {

	private String name, vote, proposal, comment;
	
	public Voter(){}
	
	public Voter(String name, String vote, String proposal, String comment){
		this.name = name;
		this.vote = vote;
		this.comment = comment;
		this.proposal = proposal;
	}
	
	public String getProposal() {
		return proposal;
	}
	
	public void setProposal(String proposal) {
		this.proposal = proposal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", vote=" + vote + ", propsal=" + proposal + ", comment=" + comment + "]";
	}
}
