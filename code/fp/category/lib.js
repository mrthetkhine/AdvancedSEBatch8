const MayBe = (value) => ({
        valueOf()
        {
            return value;
        },
        isEmpty()
        {
            return value==null || value==undefined;
        },
        map(f)
        {
            return this.isEmpty()?MayBe.of(null): MayBe.of(f(value));
        },
        orElse(defaultValue)
        {
            return this.isEmpty()?MayBe.of(defaultValue):MayBe.of(value);
        }
    });
MayBe.of = MayBe;