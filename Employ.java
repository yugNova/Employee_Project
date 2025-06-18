class Employ{
String name;
int id;
int age;
double salary;

Employ(){
}
Employ(String name, int id, int age, double salary){
this.name=name;
this.id=id;
this.age=age;
this.salary=salary;
}
public String getDetails(){
 return "Name is: "+name+"\tID is: "+id+"\tAge is: "+age+"\tSalary is: "+salary;
}

}

