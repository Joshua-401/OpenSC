-- test case: find variable fail

signature SimpleStorage {
    storage storedData : UInt;
    constructor c : UInt -> void;
    method set : (UInt, UInt) -> void;
}

-- implementation

constructor c (s : UInt){
  storage
    storedData              |-> s;
  returns void;
}

method set(x: UInt) {
	guard{}
	storage{}
	effects{}
	returns void;
}

