class Animal {
    // constructor: color, energy
    constructor(color,energy){
        this.color = color;
        this.energy = energy;
    }
    // isActive()
        // if energy > 0, energy -=20, console log energy
        // else if energy <= 0, sleep()
    isActive(){
        if(this.energy>0){
            this.energy-=20;
            console.log(this.energy);
        }else{
       this.sleep();
        }
    }
    // sleep()
        // energy += 20
        // console.log energy
        sleep(){
            this.energy += 20;
            console.log(this.energy);
        }
}
class Cat extends Animal {
    // constructor: sound, canJumpHigh, canClimbTrees, color, energy
    // makeSound()
        // console.log sound
    constructor(sound, canJumpHigh, canClimbTrees, color, energy){
        this.sound = sound;
        this.canJumpHigh = canJumpHigh;
        this.canClimbTrees = canClimbTrees;
        this.color = color;
        this.energy = energy;
    }
    makeSound(){
        console.log(this.sound);
    }
}
class Bird extends Animal {
    // constructor: sound, canFly, color, energy
    constructor( sound, canFly, color, energy){
      this.sound = sound;
      this.canFly = canFly;
      this.color = color;
      this.energy = energy;
    }
    // makeSound()
        // console.log sound
        makeSound(){
            console.log(this.sound);
        }
}
class HouseCat extends Cat {
    constructor(houseCatSound = "meow", sound,canJumpHigh,canClimbTrees, color,energy) {
        super(sound,canJumpHigh,canClimbTrees, color,energy);
        this.houseCatSound = houseCatSound;
    }
    makeSound(option) {
        if (option) {
            super.makeSound();
        }
        console.log(this.houseCatSound);
    }
}

class Tiger extends Cat {
    constructor(tigerSound = "Roar!", sound,canJumpHigh,canClimbTrees, color,energy) {
        super(sound,canJumpHigh,canClimbTrees, color,energy);
        this.tigerSound = tigerSound;
    }
    makeSound(option) {
        if (option) {
            super.makeSound();
        }
        console.log(this.tigerSound);
    }
}

class Parrot extends Bird {
    constructor(canTalk = false, sound,canFly, color,energy) {
        super(sound,canFly, color,energy);
        this.canTalk = canTalk;
    }
    makeSound(option) {
        if (option) {
            super.makeSound();
        }
        if (this.canTalk) {
            console.log("I'm a talking parrot!");
        }
    }
}