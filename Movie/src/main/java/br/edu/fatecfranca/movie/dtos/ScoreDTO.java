package br.edu.fatecfranca.movie.dtos;

public class ScoreDTO {
	private Long movieId;
	private String email;
	private Double score;
	
	public ScoreDTO() {
		
	}
	
	public ScoreDTO(Long movieId, String email, Double score) {
		super();
		this.movieId = movieId;
		this.email = email;
		this.score = score;
	}
	
	public ScoreDTO(ScoreDTO scoreDTO) {
		this.movieId = scoreDTO.getMovieId();
		this.email = scoreDTO.getEmail();
		this.score = scoreDTO.getScore();
	}
	
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
