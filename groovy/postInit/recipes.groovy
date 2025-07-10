
crafting.removeByOutput(item('techguns:itemshared', 57)); // Mechaniical Parts ( Iron )
minecraft.crafting.shapedBuilder()
    .output(item('techguns:itemshared:57'))
    .row('FPF')
    .row('PRP') 
    .row('FPF') 
    .key('F', item('ic2:itemmisc', 53))
    .key('P', item('minecraft:gold_nugget'))
    .key('R', item('ic2:itemmisc', 450)) 
    .register();



crafting.removeByOutput(item('techguns:itemshared', 62)); // Copper Wire
minecraft.crafting.shapedBuilder()
    .output(item('techguns:itemshared:62'))
    .row(' C ')
    .row('CCC') 
    .row(' C ') 
    .key('C', item('ic2:itemcable'))
    .register();



crafting.removeByOutput(item('ic2:blockmachinelv')); // Machine Block
minecraft.crafting.shapedBuilder()
    .output(item('ic2:blockmachinelv'))
    .row('FCF')
    .row('CEC') 
    .row('FCF') 
    .key('F', item('ic2:itemmisc', 53))
    .key('C', item('techguns:itemshared', 62))
    .key('E', item('techguns:itemshared', 57)) 
    .register();


crafting.removeByOutput(item('ic2:blockmachinelv', 1)); // Fornalha de Ferro
minecraft.crafting.shapedBuilder()
    .output(item('ic2:blockmachinelv', 1))
    .row(' C ')
    .row('CEC') 
    .row(' C ') 
    .key('C', item('ic2:itemmisc', 53))
    .key('E', item('minecraft:furnace'))
    .register();

crafting.removeByOutput(item('techguns:itemshared', 33)); // Iron Receiver
minecraft.crafting.shapedBuilder()
    .output(item('techguns:itemshared', 33))
    .row('III')
    .row('BEC') 
    .row(' MC') 
    .key('C', item('ic2:itemmisc',256))
    .key('I', item('ic2:itemmisc',258))
    .key('E', item('techguns:itemshared',70))
    .key('M', item('ic2:itemmisc',262))
    .key('B', item('techguns:itemshared',39))
    .register();


crafting.removeByOutput(item('techguns:itemshared', 34)); // Steel Receiver
minecraft.crafting.shapedBuilder()
    .output(item('techguns:itemshared', 34))
    .row('AAA')
    .row('EIE') 
    .row(' AA') 
    .key('E', item('techguns:itemshared',158))
    .key('I', item('techguns:itemshared', 33))
    .key('A', item('ic2:itemmisc',257))
    .register();


crafting.removeByOutput(item('techguns:itemshared', 35)); // Hardened Receiver
minecraft.crafting.shapedBuilder()
    .output(item('techguns:itemshared', 35))
    .row('IME')
    .row('VEC') 
    .row('   ') 
    .key('E', item('ic2:itemmisc',257))
    .key('C', item('ic2:itemcable',1))
    .key('M', item('techguns:itemshared',70))
    .key('I', item('techguns:itemshared', 34))
    .key('V', item('techguns:itemshared',59))
    .register();


crafting.removeByOutput(item('techguns:itemshared', 36)); // Carbon Receiver
minecraft.crafting.shapedBuilder()
    .output(item('techguns:itemshared', 36))
    .row('IMP')
    .row('CMC') 
    .row('   ')     
    .key('C', item('ic2:itemmisc',256))
    .key('M', item('techguns:itemshared',158))
    .key('I', item('techguns:itemshared', 35))
    .key('P', item('ic2:itemmisc',264))
    .register();

crafting.removeByOutput(item('techguns:itemshared', 130)); // Titanium Receiver
minecraft.crafting.shapedBuilder()
    .output(item('techguns:itemshared', 130))
    .row('C1C')
    .row('3P2') 
    .row('R4R') 
    .key('R', item('ic2:itemreflectors',2))    
    .key('C', item('ic2:itemheatstorage',2))   
    .key('1', item('techguns:itemshared', 36))
    .key('2', item('techguns:itemshared', 35))
    .key('3', item('techguns:itemshared', 34))
    .key('4', item('techguns:itemshared', 33))
    .key('P', item('ic2:blockelectric', 5))
    .register();


crafting.removeByOutput(item('ic2:itemmisc',254))
minecraft.crafting.shapedBuilder()
    .output(item('ic2:itemmisc',254))
    .row('PC ') 
    .row('CPC')
    .row(' CP') 
    .key('P', item('ic2:itemmisc',6))    
    .key('C', item('techguns:itemshared',64))
    .register();