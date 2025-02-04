package com.corejava;

public class StudentImpl {
	
	private String name;
    private int age;
    private String passport;
	public StudentImpl(String name, int age, String passport) {
		this.name = name;
		this.age = age;
		this.passport = passport;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this)
			return true;
		if (!(obj instanceof StudentImpl)) {
            return false;
		}
            StudentImpl studentImpl = (StudentImpl) obj;
            
            return studentImpl.name.equals(name) &&
            		studentImpl.age==age &&
            		studentImpl.passport.equals(passport);
        }
	  @Override
	    public int hashCode() {
	        int result = 17;
	        result = 31 * result + name.hashCode();
	        result = 31 * result + age;
	        result = 31 * result + passport.hashCode();
	        return result;
	    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	

}
