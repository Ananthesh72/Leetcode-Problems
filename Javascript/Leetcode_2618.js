/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
        return typeof classFunction === 'function' && obj != null && Object(obj) instanceof classFunction;

};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */