package jp.gauzau.MikuMikuDroid;

public class RigidBody {

	public String name;
	public short bone_index;
	public byte group_index;
	public short group_target;
	public byte shape;
	public float[] size;
	public float[] location;
	public float[] rotation;
	public float weight;
	public float v_dim;
	public float r_dim;
	public float recoil;
	public float friction;
	public byte type;
	public float[] cur_location;
	public double[] cur_r;
	public double[] cur_v;
	public double[] cur_a;
	public double[] tmp_r;
	public double[] tmp_v;
	public double[] tmp_a;
	public double[] prev_r;

}
