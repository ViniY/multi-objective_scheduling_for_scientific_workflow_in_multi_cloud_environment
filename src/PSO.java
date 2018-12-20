import java.util.*;
public class PSO {
	private int particle_number;
	private ArrayList<Task> tsk_list = new ArrayList<>();
	private int task_number;
	private ArrayList<Particle> swarm = new ArrayList<>();

	public PSO(int particle_number,ArrayList<Task>task_list) {
		this.particle_number = particle_number;
		this.tsk_list = task_list;
		this.task_number = this.tsk_list.size();
	}
	public void Set(double[] x) {

	}

	public int getParticleNumber() {
		return this.particle_number;
	}

	public void setParticleNumber(int num) {
		this.particle_number = num;
	}

	public void Initialisation() {
		for(Particle p : this.swarm) {
			p.initial_particle();
		}
	}






	private class Particle{
		private double[] Position = new double[2];
		private double Fitness;
		private double[] velocity = new double[2];
		private double[] local_best = new double[2];
		public Particle(double[] Position, double Fitness, double[] Velocity, double[]local_best) {
			this.velocity = Velocity;
			this.local_best = local_best;
			this.Position = Position;
			this.Fitness = Fitness;

		}
		public void initial_particle() {
			while(this.velocity[0]==0&&this.velocity[1]==0) {
				this.velocity[0] = Math.random();
				this.velocity[1] = Math.random();
			}
			while(this.Position[0] ==0 && this.Position[1] ==0) {
				this.Position[0] = Math.random();
				this.Position[1] = Math.random();
			}
//no need to initial the local best for the first iteration


		}


	}

}
