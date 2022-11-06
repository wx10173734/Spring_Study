bean的生命周期按照粗略的5步，

* 第一步:实例化bean
* 第二步:给bean属性赋值，调用set方法
* 第三步:初始化bean 会调用bean的Init方法，这个Init方法要自己写，自己配
* 第四步：使用bean
* 第五步：销毁bean 调用Bean的destroy方法 注意:这个destory方法需要自己写，自己配

bean的生命周期按照7步，比五步添加的那两步在哪里?在初始化Bean的前和后。

* 第一步:实例化bean
* 第二步:给bean属性赋值，调用set方法
* 第三步:执行bean后处理器的before方法
* 第四步:初始化bean 会调用bean的Init方法，这个Init方法要自己写，自己配
* 第五步执行bean后处理器的after方法
* 第六步：使用bean
* 第七步：销毁bean 调用Bean的destroy方法 注意:这个destory方法需要自己写，自己配

bean的生命周期按照10步，比七步添加的那三步在哪里?

点位1：在“Bean后处理器"before方法之前
    干了什么事？
        检查Bean是否实现了Aware相关的接口，如果实现了接口则调用这些接口中的方法。
        然后调用这些方法的目的是为了给你传递一-些数据，让你更加方便使用。
点位2：在“Bean后处理器"before方法之后
    干了什么事？
        检查Bean是否实现了InitializingBean接口，如果实现了，则调用接口中的方法。

点位3：使用Bean之后，或者说销毁Bean之前
    干了什么事？
        检查Bean是否实现了DisposabLeBean接口，如果实现了，则调用接口中的方法。
添加的这三个点位的特点:都是在检查你这个Bean是否实现了某些特定的接口，如果实现了这些接口，则Spring容 器会调用这个接口中的方法。

