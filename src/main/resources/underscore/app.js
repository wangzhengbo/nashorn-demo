var _ = require('underscore');

console.log('Here we do some stuff with underscore');

example("_.each", function() {
  _.each([1, 2, 3], console.log);
});

example("_.map", function() {
  console.log(_.map([1, 2, 3], function(num){ return num * 3; }));
});

example("_.reduce", function() {
  console.log(_.reduce([1, 2, 3], function(memo, num){ 
    return memo + num; 
  }, 0));
});

example("_.reduceRight", function() {
  var list = [[0, 1], [2, 3], [4, 5]];
  var flat = _.reduceRight(list, function(a, b) { 
    return a.concat(b); 
  }, []);
  console.log(flat);
});

example("_.find", function() {
  var even = _.find([1, 2, 3, 4, 5, 6], function(num){ 
    return num % 2 === 0; 
  });
  console.log(even);
});

example("_.filter", function() {
  var even = _.filter([1, 2, 3, 4, 5, 6], function(num){ 
    return num % 2 === 0; 
  });
  console.log(even);
});

function example(name, ex) {
  console.log(["", name].join("\n"));
  console.log(ex);
  ex();
}
