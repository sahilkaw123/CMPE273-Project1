//baseclass
var bigClock = function(){
this.clocks = true;
}

//prototype method
bigClock.prototype.show = function(){
console.log(this.clocks ? 'Its a wall clock':'Its a wrist watch');

};

bigClock.prototype.print = function(){
console.log(this.clocks ? 'Analog Clock':'Digital Clock');

};
//subclass
var wristClock = function(type,clocks){
bigClock.call(this);

this.type = type;
this.clocks = clocks;
};

//Inherit the prototype of job
wristClock.prototype = Object.create(bigClock.prototype);
//constructor for the job
wristClock.prototype.constructor = wristClock;


wristClock.prototype.print= function(){
console.log(this.pays ? this.title +'I show Time in Analog':'I show digital time');
};
var newClk = new wristClock("WallClock", false);
var newClk2 = new wristClock("WristClock", false);
var newClk3 = new wristClock("TClock", true);


console.log(newClk.show());
console.log(newClk2.print());
console.log(newClk3.show());
