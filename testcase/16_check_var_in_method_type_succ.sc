-- test case: find variable type succ

signature SimpleStorage {
    storage tag : Bool;
    constructor c : void -> void;
    method set : (int, Bool) -> void;
}

-- implementation

constructor c (){
  storage
  returns void;
}

method set(x: int, y: Bool) {
	guard{
        x > 0;
    }
	storage{
        tag     |-> y;
    }
	effects{}
	returns void;
}
