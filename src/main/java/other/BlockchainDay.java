package other;

import java.util.List;

public class BlockchainDay {

    private String status;
    private String name;
    private String unit;
    private String period;
    private String description;
    private List<BlockchainValues> values;

    public List<BlockchainValues> getValues() { return this.values; }
    public void setValues(List<BlockchainValues> values) { this.values = values; }

    public String getStatus() { return this.status; }
    public void setStatus(String status) { this.status = status; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getUnit() { return this.unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public String getPeriod() { return this.period; }
    public void setPeriod(String period) { this.period = period; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }
}
